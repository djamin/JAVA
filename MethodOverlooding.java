// same function but datatype different
class doubleValue

{
	int doubles(int number)
	{
		int d;
		d=number*2;
		System.out.println("double of the integer : "+d);
		return 0;
	}
	
	long doubles(long number)
	{
		long d;
		d=number*2;
		System.out.println("double of the long : "+d);
		return 0;
	}
	
	float doubles(double number)
	{
		double d;
		d=number*2;
		System.out.println("double of the long : "+d);
		return 0;
	}
}



public class MethodOverlooding {

	public static void main(String[] args) {
		doubleValue d=new doubleValue();
		d.doubles(2);
		d.doubles(65575);
		d.doubles(3.152);
	}

}
