class stu
{
	public int roll;
	private String name;
	private float mark;
	void getdata(int r, String n, float m)
	{
		roll=r;
		name=n;
		mark=m;
		
	}
	void display()
	{
		getdata(101,"ruhul",25);
		System.out.println("roll is :"+roll);
		System.out.println("name is :"+name);
		System.out.println("mark is :"+mark);
		
	}
	
}

public class Argument {

	public static void main(String[] args) {
		stu s = new stu();
		s.display();
	
	}

}
