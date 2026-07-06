package lw03;

import java.util.Scanner;

public class lw02cw {
	
	public static void main(String[] args) {
		
		Scanner obj1 = new Scanner(System.in);
		
		System.out.println("Enter int 1: ");	
		int int1 = obj1.nextInt();
		System.out.println("Enter int 2: ");
		int int2 = obj1.nextInt();
		System.out.println("Enter int 3: ");
		int int3 = obj1.nextInt();
		System.out.println("Enter int 4: ");
		int int4 = obj1.nextInt();
		
		int sum = int1+int2+int3+int4;
		
		
		System.out.println("Enter float1: ");
		float fl1 = obj1.nextFloat();
		
		System.out.println("Enter float2: ");
		float fl2 = obj1.nextFloat();
		
		System.out.println("Enter float3: ");
		float fl3 = obj1.nextFloat();
			
		float prodfl = fl1 * fl2 * fl3;
		
		System.out.println("Enter your first test score: ");
		Double d1 = obj1.nextDouble();
		System.out.println("Enter your second test score: ");
		Double d2 = obj1.nextDouble();
		System.out.println("Enter your third test score: ");
		Double d3 = obj1.nextDouble();
		
		Double max = Math.max(d1, Math.max(d2, d3));
		Double min = Math.min(d1, Math.min(d2, d3));
		
		Double testavg = (max + min) / 2;
		
		System.out.println("Enter the salary for February: ");
		Double feb = obj1.nextDouble();
		System.out.println("Enter the salary for March: ");
		Double mar = obj1.nextDouble();
		System.out.println("Enter the salary for April: ");
		Double april = obj1.nextDouble();
		
		Double salmax = Math.max(feb, Math.max(mar, april));
		Double salmin = Math.min(feb, Math.min(mar, april));
		Double res = (Math.ceil(salmax))+(salmin/2);
		
		
		System.out.println("The sum of the four integers are: " +sum);
		System.out.println("The product of the four floats are: " + prodfl );
		System.out.println("The difference of the sum and product is: "+ (sum-prodfl));
		System.out.println("The average of sum is: "+ (sum/4) + " " + "The average of the product is :" + (prodfl/3) );
		System.out.println("The square of sum is: "+ Math.pow(sum, 2) +" "+"The square of the product is: " + Math.pow(prodfl, 2));
		System.out.println("The max test score is: " + max);
		System.out.println("The min test score is: "+min);
		System.out.println("The avg between the max and the min is: "+testavg);
		System.out.println("The rounded salary is: "+res);

		
		
		

    }
}
