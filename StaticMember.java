
class statics
{
	static int i;
	void display()
	{
		System.out.println("value of static member variable: "+i);
	}
}

class statics2
{
	static int i=20;
	void display()
	{
		System.out.println("value of static member variable: "+i);
	}
}
class statics3
{
	static int i;
	statics3()
	{
		i++;
	}
	void display()
	{
		System.out.println("value of static member variable: "+i);
	}
}

public class StaticMember {

	public static void main(String[] args) {
		statics s1=new statics();
		statics s2=new statics();
		s1.display();
		s2.display();
		

		statics2 s3=new statics2();
		statics2 s4=new statics2();
		s3.display();
		s4.display();
		
		
		statics3 s5=new statics3();
		statics3 s6=new statics3();
		statics3 s7=new statics3();
		statics3 s8=new statics3();
		statics3 s9=new statics3();
		statics3 s10=new statics3();
		statics3 s11=new statics3();
		s5.display();
		
	}

}
