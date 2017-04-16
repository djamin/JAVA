
public class Exception1 {

	public static void main(String[] args) {
	
		int x,y,z,d;
		x=5;y=10;z=15;
		try{
		d=z/(y-2*x);//division by zero//ERROR FOUND.
		System.out.println("this line will not be executed");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("division by zero");
		}
		d=z/(y-x);//ok and display
		System.out.println("now d= "+d);
	}

}
