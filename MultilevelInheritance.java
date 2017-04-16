class nstu
{
	int code;
	String name_nstu;
	void getdata()
	{
		code=3800;
		name_nstu="university";
		
	}
	void display()
	{
		System.out.println("code : "+code);
		System.out.println("name : "+name_nstu);
		
		
	}
}

class exams extends nstu
{
	float date;
	void getdata()
	{
		date=20;
		
	}
	void display()
	{
		System.out.println("exam date: "+date);
		
	}
	
}
class results extends exams
{
	nstu n=new nstu();
	//n is an object of nstu class .
	exams e=new exams();
	//e is an object of exam class.
	void getdata()
	{
		n.getdata();
		e.getdata();
		
	}
	void display()
	{
		n.display();
		e.display();
	}
			
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		results r=new results();
		r.getdata();
		r.display();

	}

}
