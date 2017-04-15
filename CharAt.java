package string_code;

public class CharAt {

	public static void main(String[] args) {
		//using
		// string s1;
		//char ch=s1.charAt(i);
		String name;
		name=new String ("ruhul amin");
		System.out.println("in the string"+ name);
		int l=name.length();
		for(int i=0;i<l;i++)
		{
			char ch=name.charAt(i);
			System.out.println("character at ' " +i +" ' is : " +ch);
			
		}

	}

}
