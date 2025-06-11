package xyz;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {
	public static void main (String[]args) {
		Queue<String> students = new LinkedList<String>();
		students.add("Student 1");
		students.add("Student 2");
		students.add("Student 3");
		System.out.println(students);
		String firstOut = students.poll();
		System.out.println(firstOut);
		System.out.println(students);
	}

}