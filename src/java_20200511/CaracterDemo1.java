package java_20200511;

public class CaracterDemo1 {
	public static void main(String[] args) {
		char c1 = '\uc720';
		char c2 = '\uc544';
		char c3 = '\uc601';
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);
		
		char c4 = 97;
		System.out.println(c4);
		
		char c5 = '유';
		System.out.println(c5);
		
		char c6 = '\'';
		char c7 = '\"';
		char c8 = '\\';
		String s1 = "'";
		String s2 = "\"";
		String s3 = "\\";
		
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("aa"+'\t'+"bb");
		System.out.println("aa"+'\n'+"bb");
		System.out.println("aa"+'\r'+"bb");
	}
}
