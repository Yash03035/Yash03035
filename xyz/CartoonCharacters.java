package xyz;
import java.util.ArrayList;
import java.util.Collections;
public class CartoonCharacters {
    public static void main(String[] args) {
        ArrayList<String> characters = new ArrayList<>();
        characters.add("Aarthi");
        characters.add("Pallavi");
        characters.add("Yashwi");
        characters.add("Sruthi");
        characters.add("Vaishu");
        characters.remove("Yashwi");
        int index = characters.indexOf("Sruthi");
        if (index != -1) {
            characters.set(index, "Nikki");
        }
        System.out.println("Cartoon Characters:");
        for (String name : characters) {
            System.out.println(name);
        }
        Collections.sort(characters);
        System.out.println("\nSorted Cartoon Characters:");
        for (String name : characters) {
            System.out.println(name);
        }
    }
}