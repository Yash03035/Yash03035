package xyz;
class Car extends Thread {
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("BMW car is moving" + i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
		}
	}
}
}
class Bike extends Thread {
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Ninja Bike is moving " + i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
		
	}
}
public class SimpleRace {

	public static void main(String[] args) {
		
		new Car().start();
		new Bike().start();
	}
}