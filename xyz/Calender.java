package xyz;
import java.util.Scanner;
public class Calender {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String Day=sc.nextLine().toLowerCase();
		switch(Day) {
		case "monday":
			System.out.println("Lets learn python");
			break;
		case "tuesday":
			System.out.println("Lets learn java");
			break;
		case "wednesday":
			System.out.println("Lets learn html");
			break;
		case "thursday":
			System.out.println("Lets learn c");
			break;
		case "friday":
			System.out.println("Lets learn R");
			break;
		case "saturday":
			System.out.println("Lets learn c++");
			break;
		case "sunday":
			System.out.println("Lets take break");
			break;
		default:
			System.out.println("Lets learn coding");
		}
	}

}
