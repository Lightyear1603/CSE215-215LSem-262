package labwork05;
import java.util.Scanner;

public class labwork05cw {
	
	public static int calculate(int a, int b) {
		
		return a+b;
	}
	
	public static int calculate(int a, int b, int c) {
		
		return a*b*c;
	}
	
	public static double calculate(double number, String op) {
		
		if (op.equals("square")) {
			
			return number*number;
			
		} else if (op.equals("cubed")) {
			
			return number*number*number;
		}
		else {
			return 0.0;
		}
	}
	
	public static String calculate(int a, int b, String op) {
		
		if(op.equals("product")) {
			
			return ""+ (a * b);
		} else if (op.equals("add")) {
			
			return ""+ (a + b);
		} else if (op.equals("subtract")) {
			
			return ""+ (Math.max(a, b) - Math.min(a, b));
		} else if (op.equals("divide")) {
			return ""+ (a / b);
		} else {
			return "Invalid choice";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter two integers for addition:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Addition: "+calculate(a,b));
        
        System.out.println("Enter three integers for multiplication:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        System.out.println("Product: "+calculate(x,y,z));
        
       
        System.out.println("Enter number for expotential multiply: ");
        double number = scan.nextDouble();
        System.out.println("Enter operator");
        String op = scan.next();
        System.out.println("Squared: "+calculate(number,op));
        
        System.out.println("Enter two integers:");
        int a1 = scan.nextInt();
        int b1 = scan.nextInt();
        System.out.println("Enter sign: ");
        String op1 = scan.next();
        System.out.println("Result: "+calculate(a1,b1,op1));
        
        
	}

}
