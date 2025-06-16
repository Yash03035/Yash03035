package xyz;

public class BackTracking {
	
	public static void makeWords(String current,String letters) {
		if(current.length()==3) {
			System.out.println(current);
			return;
		}
		for(int i=0;i<letters.length();i++) {
			makeWords(current+letters.charAt(i),letters);
		}
		
	}

	public static void main(String[] args) {
	   makeWords(" ","ABC");

	}

}