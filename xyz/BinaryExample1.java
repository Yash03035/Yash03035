package xyz;
import java.util.Arrays;
import java.util.Scanner;

public class BinaryExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements (space-separated):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array for binary search
        Arrays.sort(arr);

        // Input the element to search
        System.out.print("Enter the element to find: ");
        int key = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index (after sorting): " + result);
        }
        scanner.close();
    }

    // Binary search function
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1; // Not found
    }
}