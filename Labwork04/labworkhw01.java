package labwork04;
import java.util.Scanner;

public class labworkhw01 {
	
	public static int sumOfsquares(int n) {
		int sum = 0;
		
		for (int i = 0;i<=n;i++) {
			
			sum = sum + (i * i);
		}
		
		return sum;
	}
	
	public static int sum(int s) {
		
		int sum=0;
		int i=0;
		
		do {
			sum=sum+i;
			i++;
		} while (i<=s);
		
		return sum;
	}
	
	public static void checkprime(int p) {
		
		int i = 2;
		int count = 0;
		
		if (p<=1) {
			
			System.out.println("The number is not prime");
		}
		
		while (i < p) {
			if (p%i==0) {
				count++;
			}
			
			i++;
		}
		if (count !=0) {
			
			System.out.println("The number is not prime");
		} else {
			
			System.out.println("The number is prime");
		}
	}
	
	public static int fact(int f) {
		int fact = 1;
		int i = 1;
		
		if (f == 0 ) {
			return 0;
		} else {
			
			while(i<=f) {
				fact = fact*i;
				i++;
				
			}
		} return fact;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be squared: ");
        int n = scan.nextInt();
        System.out.println("Enter you factorial number: ");
        int f = scan.nextInt();
        System.out.println("Enter number for do-while sum check: ");
        int s = scan.nextInt();
        System.out.println("Enter your number for checking prime: ");
        int p = scan.nextInt();
        System.out.println("The square is: "+sumOfsquares(n));
        System.out.println("The factorial is: "+ fact(f));
        System.out.println("The sum of do-while loop: " + sum(s));
        checkprime(p);
		
		

	}

}
