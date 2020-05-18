package java_20200511;

public class CharacterDemo {
	public static void main(String[] args) {
		//1. 유니코드 표현 => '\u0000'
		char c1 = '\uc720';
		char c2 = '\uc544';
		char c3 = '\uc601';
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);
		
		//2. 아스키코드 표현
		// 48-57 => 0-9
		// 65-90 => A-Z
		// 97-122 => a-z
		
		char c4 = 97;
		System.out.println(c4);
		
		//3. 문자 표현법
		char c5 = '유';
		System.out.println(c5);
		
		//4. Escape Character
		//문자 표현할때 ',\는 앞에 \를 붙여줘야함.
		char c6 = '\'';
		char c7 = '\\';
		System.out.println(c6);
		System.out.println(c7);
		
		//문자열 표현할때 ", \는 앞에 \를 붙여줘야함.
		String s1 = "\"";
		String s2 = "\\";
		System.out.println(s1);
		System.out.println(s2);
		//',",\표현할때 헷갈리면 무조건\붙이기!! 왜냐하면 \는 문자로 인식안하기 때문.원래 \붙이는게 원칙임.
		
		//\t:Tab
		//\n:Line Feed(윈도우에서 엔터)
		//\r:Carriage Return(유닉스?에서 엔터)
		System.out.println("aa"+'\t'+"bb");
		System.out.println("aa"+'\n'+"bb");
		System.out.println("aa"+'\r'+"bb");
		
		
	}
}
