package xyz;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class HashSetToListExample {
    public static void main(String[] args) {
        // Create a HashSet and add some elements
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Convert HashSet to List
        List<String> list = new ArrayList<>(hashSet);

        // Print the List
        System.out.println("Elements in List: " + list);
    }
}