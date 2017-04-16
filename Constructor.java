class student 
{
	int roll;
	String name;
	float mark;
	
	student ()// default constructor
	{
		roll=58;
		name="ruhul";
		mark=302;
	}
	
	
	student(int r,String n,float m) // ARGUMENT CONSTRUCTOR
	{
		roll=r;
		name=n;
		mark=m;
	}
	
	student(student s) //copy constructor
	{
		roll=s.roll;
		name=s.name;
		mark=s.mark;
		
	}
	
	void display()
	{
		System.out.println("roll is : "+roll);
		System.out.println("name is : "+name);
		System.out.println("mark is : "+mark);
	}
}




public class Constructor {

	public static void main(String[] args) {
		
		student s1=new student();//default constructor invoked.
		System.out.println("record of s1: " );
		s1.display();
		System.out.println();
		
		
		student s2=new student(100,"amin",300);//Argument  constructor invoked.
		System.out.println("record of s2: " );
		s2.display();
		System.out.println();
		
		
		student s3=new student(s2);//copy constructor invoked.
		System.out.println("record of s3: " );
		s3.display(); //display record of s2.
		
		s3=s1;// object s3 is initialized by s1.
		System.out.println();
		System.out.println("new record of s3 : ");
		s3.display();// displays record of s2.
		
		

	}

}
