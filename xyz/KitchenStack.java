package xyz;
import java.util.Stack;

public class KitchenStack {
    public static void main(String[] args) {
        Stack<Integer> plates = new Stack<>();
        plates.push(1);
        plates.push(2);
        plates.push(3);
        plates.push(4);
        plates.push(5);
        System.out.println("Plates in the stack: " + plates);
        System.out.println("Number of plates left: " + plates.size());
        int eatenPlate = plates.pop();
        System.out.println("Plate taken (eaten): " + eatenPlate);
        System.out.println("Plates left in the stack: " + plates);
        System.out.println("Number of plates left: " + plates.size());
    }
}