abstract class tree
{
	public int treeNum;
	public String treeName;
	abstract void getdata();
	//can't body explain.
}
class animal extends tree
{
	float aniNum;
	void getdata()
	{
		treeNum=100;
		treeName="mango";
		aniNum=10;
	}
	void display()
	{
		 System.out.println(+treeNum);
		 System.out.println(treeName);
		 System.out.println(+aniNum);
	}
}
public class Abstract {

	public static void main(String[] args) {
		animal a=new animal();
		a.getdata();
		a.display();
		

	}

}
