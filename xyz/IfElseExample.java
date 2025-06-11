package xyz;
import java.util.Scanner;

public class IfElseExample {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("it is raining (yes/no) :");
		String answer=sc.next();
		if(answer.equals("yes")) {
			System.out.println("take an umbrella");
		}else {
			System.out.println("no need to take an umbrella");
		}
	}

}