
class reff
{
	int a,b;
	reff(int x,int y)
	{
		a=x;
		b=y;
		
	}
	void change(reff r)
	{
		r.a=r.a/2;
		r.b=r.b*2;
	}
	
	
}
public class CallbyRefference {

	public static void main(String[] args) {
	reff obj=new reff(20,30);
	
	obj.change(obj);
	System.out.println(+obj.a);
	System.out.println(+obj.b);
	}

}
