package labwork07;
import java.util.Scanner;
public class cw01main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		cw01student student1info = new cw01student();
		student1info.displayStudentInfo();
		System.out.println("Enter ID");
		int ID = scan.nextInt();
		System.out.println("Enter Name");
		String Name = scan.next();
		System.out.println("Enter GPA: ");
		Double GPA = scan.nextDouble();
		cw01student studentinfo2 = new cw01student(ID, Name, GPA);
		studentinfo2.displayStudentInfo();
		student1info.GPA = 2.35;
		student1info.displayStudentInfo();
		
        
	}

}
