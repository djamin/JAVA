package string_code;

public class ComperTo {

	public static void main(String[] args) {
		String s,k;
		s=new String("ruhul amin");
		k=new String("dipty jahan");
		System.out.println("string s is:" +s);
		System.out.println("string k is :"+k);
		int i=s.compareTo(k);
		if(i==0)
		System.out.println(" string s and k are equal");
		else if (i<0)
			System.out.println("string s is less than string k");
		else if (i>0)
			System.out.println("string s is greater than string k");
			
		}
		

	}


