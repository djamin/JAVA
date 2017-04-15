
class object
{
	int a;
	object(int x )
	{
		a=x;
	}
	object change()
	{
		object o=new object(a*2);
		return o;
	}
}


public class RetruntypeofObject {

	public static void main(String[] args) {
		object obj1= new object(20);
		object obj2;
		obj2=obj1.change();
		System.out.println(+obj1.a);
		System.out.println("\t");
		System.out.println(+obj2.a);
		System.out.println("\n");
		obj2=obj2.change();
		System.out.println(+obj1.a);
		System.out.println("\t");
		System.out.println(+obj2.a);
	}

}
