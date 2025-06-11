package Aarthi;
import java.util.Scanner;
import java.util.TreeSet;
public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> sortedStrings = new TreeSet<>();
        System.out.println("Enter strings (type 'exit' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            sortedStrings.add(input);
        }
        System.out.println("Strings in alphabetical order:");
        for (String str : sortedStrings) {
            System.out.println(str);
        }
        scanner.close();
    }
}