package labquizsol1;
import java.util.Scanner;



public class lqsol0101 {
	
	public static Double calculate(Double num) {
		
		return num*num;
		
	}
	
	public static Double calculate(double num, String operation) {
		int fact = 1;
		int i=1;
		if (operation.equals("cube")) {
			return (double) (num*num*num);
		} else if (operation.equals("fact")) {
			
			while(i<=num) {
				fact = fact * i;
				i++;
			}
			return (double) fact;
		}
		else {
			return null;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String op= "cube";
		String op2= "fact";
	
		System.out.println("Enter n");
		Double num = scan.nextDouble();
		System.out.println("Square= "+calculate(num));
		System.out.println("Cube= "+calculate(num,op));
		System.out.println("Fact= "+calculate(num,op2));
		

	}

}
