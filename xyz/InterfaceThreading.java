package xyz;
class Car1 implements Runnable {
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
class Bike1 implements Runnable  {
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
public class InterfaceThreading {

	public static void main(String[] args) {
		Thread caThread=new Thread(new Car1());
		Thread baThread=new Thread(new Bike1());
		System.out.println("Gooo");
		caThread.start();
		baThread.start();
		
	}
}