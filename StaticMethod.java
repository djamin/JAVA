class method{
	public static int x=5;
	static int method1()
	{
		System.out.println("value of method1: "+x);
		return 0;
	}
	static int method2()
	{
		System.out.println("value of method2: "+x);
		return 0;
	}
}

public class StaticMethod {

	public static void main(String[] args) {
	
		method m=new method();
		System.out.println();
		m.method1();
		m.method2();
		/*or calling 
		method.method1();
		method.method2();
		*/
	}

}
