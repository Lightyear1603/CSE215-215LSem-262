package labquizsol1;
import java.util.Scanner;
public class lqsol0102 {

	public static double approximatesin(double x, int terms) {
		
		double sum = 0;
		for(int n = 0; n<terms;n++) {
			int fact = 1;
			for(int i=1; i<=2*n+1;i++) {
				fact = fact*i;
			}
			sum = sum + ((Math.pow(-1, n))* ((Math.pow(x, 2*n+1))/(fact)));
		} return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		int terms = scan.nextInt();
		
		System.out.println(approximatesin(x,terms));

	}

}
