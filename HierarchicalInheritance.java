class father
{
	String fatherName;
	void getdata()
	{
		fatherName="abdulla";
		System.out.println("fathers name: " +fatherName);
	}
	
}
class boy extends father
{
	String boyname;
	void getdata()
	{
		boyname="ruhul";
		System.out.println("boy name is : " +boyname);
	}
}
class girl extends father
{
	int  girlage;
	void getdata()
	{
		girlage=18;
		System.out.println("girl name is : " +girlage);
		
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		father f=new father();
		f.getdata();
		boy b=new boy();
		b.getdata();
		girl g=new girl();
		g.getdata();
	}

}
