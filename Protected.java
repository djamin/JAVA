
class stude {
	
	protected int roll;
	protected String name ;
	protected void getdata()
	{
		roll=101;
		name="ruhul";
		
	}
	protected void display()
	{
		
		
		System.out.println("print roll: "+roll);
		System.out.println("print roll: "+name);

	}	
	
}
public class Protected {

	public static void main(String[] args) {
		
		stude s=new stude();
		s.getdata();
		s.display();
		

	}

}
