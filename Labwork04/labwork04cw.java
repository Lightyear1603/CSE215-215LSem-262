package labwork04;

import java.util.Scanner;

public class labwork04cw {
	
	public static String scoreanalyzer(double score) {
		
		if (score>=90&&score<=100) {
			
			return "A";
		} else if (score>=80) {
			return "B";
		} else if (score>=70) {
			return "C";
		} else if (score>=60) {
			return "D";
		} else {
			return "F";
		}
		
	}
	
	public static int mathmax(int a, int b) {
		
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter mark: ");
		double score = scan.nextDouble();
		System.out.println("Enter a: ");
		int a = scan.nextInt();
		System.out.println("Enter b: ");
		int b = scan.nextInt();
		System.out.println("Grade is: "+scoreanalyzer(score));
		System.out.println(mathmax(a,b)+" "+"is the bigger number");
		

	}

}
