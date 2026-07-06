package labwork03;

import java.util.Scanner;

public class labwork03a {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		
		String name = scan.nextLine();
		
		System.out.println("Enter a integer: ");
		int n = scan.nextInt();
		int sum = 0;
		int i = 0;
		
		while (i <= n) {
			
			sum = sum + i;
			i++;
		}
		
		char first = name.charAt(0);
		first = Character.toUpperCase(first);
		
		if (first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U') {
			
			System.out.println("Your name starts with a vowel");
		}
		
		else {
			
			System.out.println("Your name starts with a consonant");
		}
		
		System.out.println("The summition is: "+sum);
	  }

        

}
