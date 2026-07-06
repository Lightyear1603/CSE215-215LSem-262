package labwork06;
import java.util.Arrays;
import java.util.Scanner;

public class lwhw01 {
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int[] arr1 = new int[20];
	
	for(int i = 0;i<arr1.length;i++) {
		
		System.out.println("Enter element: "+(i+1));
		arr1[i]=scan.nextInt();	
	}
	
	System.out.println("Unsorted Array");
	
for(int i = 0;i<arr1.length;i++) {
		
		System.out.print(arr1[i]+" ");
		
	}

System.out.println();
	
	Arrays.sort(arr1);
	
	System.out.println("Sorted Array");
	
	for(int i = 0;i<arr1.length;i++) {
			
			System.out.print(arr1[i]+" ");
			
		}
	
	int median = (arr1[9]+arr1[10])/2;
	System.out.println();
	System.out.println("The median for matrix: "+median);
    
}
	
}
