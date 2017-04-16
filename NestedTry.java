
	// try statement 
		/* try{
			try{
				catch(exobj){}
				catch(exobj2){}
				}//end of inner try statement
				}//end of outer try statement
				*/
public class NestedTry {

	public static void main(String[] args) {
		
			
				int x,y,z,d,d1,d2;
				x=5;y=10;z=15;
				try{
				d1=z/(y-2*x);//exception//division by zero//ERROR FOUND.
				System.out.println("value of d1 is undetermined");
					try{
						d2=y/(z-3*x);//exception
					}//end inner try block
					catch(ArithmeticException e)
					{
						System.out.println("value of d2 is undetermined");
						System.out.println("division by zero");
					}//end of inner catch block
					
						
					}//end outer try block
				
				
		     catch (ArithmeticException e)		
				{
		    	 System.out.println("value of d1 is undetermined");
					System.out.println("division by zero");
		    	 
				}//end of outer catch block.
				
				
				d=z/(y-x);//ok and displayed
				System.out.println("now d= "+d);
				

				}
			
			
			


		}


