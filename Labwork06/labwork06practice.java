package labwork06;
import java.util.Scanner;

public class labwork06practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[10];
		int sum = 0;
		for(int i=0; i < arr.length;i++) {
			System.out.println("Enter element: "+ (i+1));
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<arr.length;i++) {
		  
			System.out.print(arr[i]+" ");
		 	
		}
		System.out.println();
		
		for (int i=0; i<arr.length;i++) {
			
			sum = sum+arr[i];
		}
		
		double avg = sum/(double)arr.length;
		
		System.out.println("The sum of array: "+sum);
		System.out.println("The average of array: "+avg);

	}

}
