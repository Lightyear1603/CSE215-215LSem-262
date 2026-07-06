package labwork07;

public class cw01student {

	public int ID;
	public String Name;
	public Double GPA;
	  public cw01student() {
		  ID = 0;
		  Name = "UNKNOWN";
		  GPA = 0.00;
	  }
	  
	  public cw01student(int ID, String Name, Double GPA) {
		  this.ID=ID;
		  this.Name=Name;
		  this.GPA=GPA;
	  }
	  
	  public void displayStudentInfo() {
		  System.out.println("ID: "+ID);
		  System.out.println("Name: "+Name);
		  System.out.println("GPA: "+GPA);
	  }
	  
	  
	  
	  
}
