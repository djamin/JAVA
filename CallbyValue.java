class sample
{
	void changevalue(int x,int y)
	{
		x=x/2;
		y=y*2;
		
	}
	
	
	
}
public class CallbyValue {

	public static void main(String[] args) {
		sample s=new sample();
		int a=20,b=30;
		s.changevalue(a, b);
		System.out.println(+a);
		System.out.println(+b);
	}

}
