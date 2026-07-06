package labwork06;
import java.util.Scanner;

public class lw0602 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[][] arr=new int[4][4];
		
		for (int i=0; i < arr.length;i++) {
			
			for (int j=0; j<arr[i].length;j++) {
				System.out.println("Enter element no: "+(i+1)+" "+(j+1));
				arr[i][j]=scan.nextInt();
			}
		}
			
			System.out.println("The array is: ");
			
			for(int i=0; i<arr.length;i++) {
				for(int j=0; j<arr[i].length;j++) {
					
					System.out.print(arr[i][j]);
					
				}
				System.out.println();
			}
			
			int r1s=0;
			int r2s=0;
			int r3s=0;
			int r4s=0;
			int c1s=0;
			int c2s=0;
			int c3s=0;
			int c4s=0;
			int sumdiag=0;
			
			for(int i = 0; i < arr.length; i++) {
				
				sumdiag=sumdiag+arr[i][i];
				
			}
			
			System.out.println("The sum of diagonals: "+sumdiag);
			
			System.out.println("The sum of rows: ");
			for(int i = 0; i<arr.length;i++) {
				 r1s= r1s+arr[0][i];
				 r2s= r2s+arr[1][i];
				 r3s= r3s+arr[2][i];
				 r4s= r4s+arr[3][i];
			}
			System.out.println("Sum of row 01: "+r1s);
			System.out.println("Sum of row 02: "+r2s);
			System.out.println("Sum of row 03: "+r3s);
			System.out.println("Sum of row 04: "+r4s);
			
			System.out.println("The sum of columns: ");
			for(int i = 0; i<arr.length;i++) {
				 c1s= c1s+arr[i][0];
				 c2s= c2s+arr[i][1];
				 c3s= c3s+arr[i][2];
				 c4s= c4s+arr[i][3];
			}
			System.out.println("Sum of col 01: "+c1s);
			System.out.println("Sum of col 02: "+c2s);
			System.out.println("Sum of col 03: "+c3s);
			System.out.println("Sum of col 04: "+c4s);
			
			
		}
	     

	}


