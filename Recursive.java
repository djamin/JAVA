class factorial
{
	int fact(int n)
	{
		int result;
		if (n<=0)
			return 1;
		else 
		{
			result=n*fact(n-1);
			return result;
		}
	}
	
}
public class Recursive {

	public static void main(String[] args) {
		factorial f=new factorial();
		
		
		
		System.out.println("your factorial value is : "+f.fact(15));
		
		

	}

}
