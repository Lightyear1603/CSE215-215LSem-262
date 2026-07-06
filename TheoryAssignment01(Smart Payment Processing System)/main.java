package assignment01;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int id; 
		int passcode;
		
		System.out.println("-------WAREHOUSE SECURITY LOGIN-------");
		do{
		    System.out.print("Enter Security ID: "); //Task 01- *the loop for the login, here we using do while loop which asks for password and id until in the while loop the condition breaks*/
		    id = scan.nextInt();                     

		    System.out.print("Enter Passcode: ");
		    passcode = scan.nextInt();

		    if (id == 101 && passcode == 2026) {
		        System.out.println("Access granted, welcome operator!");
		    } else {
		        System.out.println("Access denied, try again!");
		    }

		}while (id != 101 || passcode != 2026);
		
		
		
		System.out.println("How many items do you want to process?"); 
		int itemnum = scan.nextInt(); /*Scanning how many items we need*/
		int sum=0;  /*The price without any taxes*/
		int i=1;  /* initialization for while loop*/
		int price; /*price for each items*/
		
		while(i <=itemnum) {  /* Task 02- asks for prices until the desired number of items reached*/
			
			System.out.println("Enter the price for item "+i+":");
			price = scan.nextInt();
			sum=sum+price;
			i++;
		}
		
		double tax = sum * (0.15); /* Task03- 15% tax calculation*/
		double taxedprice = sum+tax; 
		int fullcrate=itemnum/5; /*each full crate can hold 5 items*/
		int left = itemnum%5; /*leftover amount done by mudulo*/
		
		if(left>0) {           /*if there are any items left after using a crate, we need another crate to store those items. this is why we are incrementing full crate*/
			fullcrate++;
		}
		
		double pricewcrate= taxedprice+ (fullcrate*10); //*per crate costs 10$ wether its full or partially used*//
		double discount = (sum>=500)?50:5; //*Task04- Used ternary operator in place of normal if-else conditional//
		double priceFinal = pricewcrate-discount; 
		int rounded = (int)Math.round(priceFinal); //*Task 05- for the bit operators to work and generate the token, the final price needs to be converted into an integer value from any double or float values*/
		int hash = rounded<<2; //*Bit shift operator used to shift the values by two places*//
		
		System.out.print("PROCESSING WAREHOUSE ORDER...");
		for(int n =1; n <=10; n++) { //*Task06 - for loading bar*//
			System.out.print("=");
		}
		System.out.print("100% Done!");
		System.out.println();
		System.out.println("---- FINAL ITEMISED RECEIPT -----");  //full receipt
		System.out.println("ITEMS PROCESSED: "+itemnum);
		System.out.println("BASE ITEMS TOTAL: $"+sum);
		System.out.println("TAX APPLIED(15%): $"+tax);
		System.out.println("CRATES USED: "+fullcrate+" "+"(REMAINDER ITEMS: "+left+")");
		System.out.println("SHIPPING FEES: 10$");
		System.out.println("LOYALTY DISCOUNT APPLIED: -$"+discount);
		System.out.println("-------------------------");
		System.out.println("FINAL TOTAL OWED: $"+priceFinal);
		System.out.println("SECURITY HASH TOKEN: "+hash);
		

	}
	
	
	
	

}
