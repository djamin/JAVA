class sample
{
	sample()//constructor defined.
	{
		System.out.println("constructor called");
	}
	public void finalized()//finalized defined
	{
		System.out.println("finalized called");
	}
}

public class FinalizedMethod {

	public static void main(String[] args) {
		sample s= new sample();
		System.out.println("\n..................");
		s.finalized();//calling finalized method.

	}

}
