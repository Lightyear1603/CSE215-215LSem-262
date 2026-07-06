package labwork03;

import java.util.Scanner;

public class labwork03hw {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		int a = scan.nextInt();
		
		int mod = a%2;
		
		switch (mod){
			
			case 0: 
				System.out.println("This number is even");
				break;
				
			default: 
				System.out.println("This number is odd");
				break;
		}
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				if (j%2==0) {
					
					System.out.print("-");
				} else {
					System.out.print("+");
				}
			}
			System.out.println();
		}
		
		System.out.println("Enter your option; 1 is for addition, 2 for subtraction, 3 for multiplicity: ");
		int op = scan.nextInt();
		
		System.out.println("Enter integer 1: ");
		int i1 = scan.nextInt();
		System.out.println("Enter integer 2: ");
		int i2 = scan.nextInt();
		System.out.println("Enter integer 3: ");
		int i3 = scan.nextInt();
		
		int add = i1+i2+i3;
		int subtraction = Math.max(i1, Math.max(i2, i3)) - Math.min(i1, Math.max(i2, i3)) - Math.min(i1, Math.min(i2, i3));
		int product = i1*i2*i3;
		switch (op) {
			
			case 1: 
				
				System.out.println("The addition of the three integers are: "+add);
				break;
			case 2:
				System.out.println("The subtraction of the three integers are: "+subtraction);
				break;
			case 3:
				System.out.println("The multiplication of the three integers are: "+product);
				break;
			default:
				System.out.println("Invalid choice!");
				break;
					
		}
		
		
	}

}
