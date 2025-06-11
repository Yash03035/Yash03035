package xyz;
	interface printable {
		void print();
	}
	class Message implements printable{
		public void print() {
			System.out.println("HELLO From INTERFACE");
		}
	}
	public class InterfaceExample {
		public static void main(String[]args) {
			Message msg = new Message();
			msg.print();
		}


	}