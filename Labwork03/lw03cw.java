package lw03;

import java.util.Scanner;

public class lw03cw {
	
	public static void Main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter your name: ");
	
	String name = scan.nextLine();
	
	char first = name.charAt(0);
	first = Character.toUpperCase(first);
	
	if (first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U') {
		
		System.out.println("Your name starts with a vowel");
	}
	
	else {
		
		System.out.println("Your name starts with a consonant");
	}
	
  }
}
