package labwork07;
import java.util.Scanner;
public class lw07cw02main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Scanner scan = new Scanner(System.in);
        
        lw07cw02square side01 = new lw07cw02square();
         side01.getSide();
         System.out.println("Area: "+side01.getArea());
         System.out.println("Perimeter: "+side01.getPerimeter());
         System.out.println("Diagonal: "+side01.getDiag());
         
         System.out.println("Enter a side legnth:");
         int s = scan.nextInt();
         lw07cw02square side02 = new lw07cw02square(s);
         side02.getSide();
         System.out.println("Area: "+side02.getArea());
         System.out.println("Perimeter: "+side02.getPerimeter());
         System.out.println("Diagonal: "+side02.getDiag());
	}

}
