package lw03;

import java.util.Scanner;

public class lab02hw {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String NAME = "Atif";
		
		System.out.println("Enter your first exam score: ");
		Double d1 = scan.nextDouble();
		System.out.println("Enter your second exam score: ");
		Double d2 = scan.nextDouble();
		System.out.println("Enter your third exam score: ");
		Double d3 = scan.nextDouble();
		System.out.println("Enter your points: ");
		
		int i1 = scan.nextInt();
		
		Double i2 = Math.pow(i1, 0.5);
		
		Double average = (d1+d2+d3)/3;
		
		System.out.println("The average exam score for"+ " "+ NAME + " "+ "is: "+average);
		System.out.println("The point raised to the power of half is:  "+i2);
		
	}

}
