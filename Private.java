

class student {
	
	private int roll;
	private String name;
	private void getdata()
	{
		roll=101;
		name="ruhul";
		
	
	}
	 void display()
	{
		getdata();
		
		System.out.println("print roll: "+roll);
		System.out.println("print roll: "+name);

	}	
	
}

public class Private {

	public static void main(String[] args) {
		
			student s=new student ();
			s.display();
			

		}

}		
		
		
		
		
	


