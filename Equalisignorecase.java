package string_code;

public class Equalisignorecase {

	public static void main(String[] args) {
		
		String s,k;
		s=new String("ruhul amin");
		k=new String("dipty jahan");
		System.out.println("string s is:" +s);
		System.out.println("string k is :"+k);
		
		boolean i =s.equalsIgnoreCase(k);
		if(i=true)
		System.out.println(" string s and k are equal");
		
		else 
			System.out.println("string s and k are not equal");
			
		}
		

	}


