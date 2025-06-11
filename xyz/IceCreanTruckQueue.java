package xyz;
import java.util.LinkedList;
import java.util.Queue;
public class IceCreanTruckQueue {
    public static void main(String[] args) {
        Queue<String> kidsQueue = new LinkedList<>();
        kidsQueue.add("Alice");
        kidsQueue.add("Bob");
        kidsQueue.add("Charlie");
        kidsQueue.add("Daisy");
        System.out.println("Kids standing in line at the ice cream truck:");
        System.out.println(kidsQueue);
        while (!kidsQueue.isEmpty()) {
            String kid = kidsQueue.poll(); 
            System.out.println(kid + " gets their ice cream!");
        }
        System.out.println("All kids have been served!");
        
    }
}