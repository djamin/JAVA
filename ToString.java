package string_code;

public class ToString {

	public static void main(String[] args) {
		// STRINGBUFFER S1
		//STRING S2
		//S2=NEW STRING (S1.TOSTRING());
		
		StringBuffer s1;
		String s2;
		s1=new StringBuffer("objet oriented programming");
		s2=new String(s1.toString());
		System.out.println(s1);
		System.out.println(s2);

	}

}
