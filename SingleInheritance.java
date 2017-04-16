class student 
{
	int roll ;
	String name;
	
}
class result extends student 
{
	
	float mark;
	void getdata()
	{
		roll=58;
		name="ruhul";
		mark=32;
		
	}
	void display()
	{
		System.out.println("roll is:"+roll);
		System.out.println("name is:"+name);
		System.out.println("mark is:"+mark);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		result r=new result();//creating object.
		r.getdata();
		r.display();

	}

}
