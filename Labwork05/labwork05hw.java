package labwork05;

import java.util.Scanner;

public class labwork05hw {
	
	public static String convert(int n) {
		
		return Integer.toBinaryString(n);
	}
	
	public static int convert(double d) {
		
		return (int) Math.round(d);
	}
	
	public static int convert(char ch) {
		
		return (int) ch;
	}
	
	public static void printMessage() {
		
		System.out.println("Goodbye and Good Riddance!");
	}
	
	public static void printMessage(String name) {
		
		System.out.println("Top of the morning "+name+"!");
	}
	
	public static void printMessage(int n1) {
		
		for (int i = 1;i <=n1;i++) {
			System.out.println("I know it hurts sometimes but, you'll get over it!");
		}
	}
	
	public static double calculateArea(int base, int height) {
		
		return 0.5*base*height;
	}
	
	public static double calculateArea(int b1, int b2, int height) {
		
		return ((b1+b2)*height)/2;
	}
	
	public static int calculateArea(int side) {
		
		return 6*(side*side);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number to convert to binary: ");
		int n = scan.nextInt();
		System.out.println("The converted binary number: "+convert(n));
		
		System.out.println("Enter double numb: ");
		double d = scan.nextDouble();
		System.out.println("Rounded integer: "+convert(d));
		
		System.out.println("Enter your character");
		char ch = scan.next().charAt(0);
		System.out.println("The ASCII value for this is: "+convert(ch));
		
		printMessage();
		System.out.println("Enter your name: ");
		String name = scan.next();
		printMessage(name);
		System.out.println("Enter the number of Interations: ");
		int n1 = scan.nextInt();
		printMessage(n1);
		
		System.out.println("Enter base and height for triangle area: ");
		int base = scan.nextInt();
		int height = scan.nextInt();
		System.out.println("The are of triangle: "+calculateArea(base,height)+"sq.units");
		
		System.out.println("Enter base1, base2, height for trapezoid area: ");
		int b1 = scan.nextInt();
		int b2 = scan.nextInt();
		int h = scan.nextInt();
		System.out.println("The area of trapezoid: "+calculateArea(b1,b2,h)+"sq. units");
		
		System.out.println("Enter the length of side for cube area: ");
		int side = scan.nextInt();
		System.out.println("The area of the cube: "+calculateArea(side)+"sq. units");
		

	}

}
