package string_code;

public class Append {

	public static void main(String[] args) {
		String s=new String("bangla");
		StringBuffer sb=new StringBuffer("welcome to java ");
		s=sb.append(s).toString();
		System.out.println(s);

	}

}
