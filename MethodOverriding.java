/*
 * if base and derive class carry same method (same prototype : same name, return type , and a
 * rgument list .)then if call method then derive class only impent .
 * 
 *  this problem called method overriding .
 */
class studnents 
{
	private int roll;
	private String name;
	void getdata()
	{
		roll=58;
		name="ruhul";
		
	}
	void display()
	{
		System.out.println("roll: "+roll);
		System.out.println(name);
	}
}

class resultt extends studnents
{
	float mark;
	
	void getdata()//same method
	{
		super.getdata();//using super keyword to reduce overriding problem.
		mark=302;
	}
	void display() // same method
	{
		super.display();///using super keyword to reduce overriding problem.
		System.out.println("mark: "+mark);
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		
		resultt r=new resultt();
		r.getdata();
		r.display();
		
		
		
	}

}
