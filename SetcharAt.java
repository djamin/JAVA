package string_code;

public class SetcharAt {

	public static void main(String[] args) {
		StringBuffer s;
		s=new StringBuffer("object oriented");
		System.out.println("the string is :" +s);
		s.setCharAt(6, '-');
		System.out.println("now the string is :"+s);

	}

}
