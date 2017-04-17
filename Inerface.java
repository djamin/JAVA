//using alternative of multiple inheritance.

interface student
{
	static final int roll=58;
	static final String name="amin";
	
	void display();
	
}
class result implements student 
{
	public float mark;
	public void display()
	{
		System.out.println("roll: "+roll);
		System.out.println("name: "+name);
	}
	public void getmark()
	{
		mark=7;
	}
	public void showmark()
	{
		System.out.println("mark: "+mark);
	}
}	

public class Inerface {

	public static void main(String[] args) {
	
		result r= new result();
		r.getmark();
		r.display();
		r.showmark();
		r.getmark();
	}

}
