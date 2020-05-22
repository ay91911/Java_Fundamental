package java_20200522;

public class StringMethodDemo {
	public static void main(String[] args) {
		String ssn = "111111-1111118";
		//charAt(int index) : 문자열중에서 특정 index에 있는 문자를 반환
		char c = ssn.charAt(6);
		System.out.println(c);
		
		//concat(String str) : 문자열 연결
		ssn = ssn.concat("abcd");//== ssn = ssn+"abcd";
		System.out.println(ssn);
		
		//endsWith(String msg) : msg문자열로 끝나면 true, 그렇지 않으면 false
		String fileName = "abcd.doc";
		if(fileName.endsWith("doc")) {
			System.out.println("워드문서 입니다.");
		}else if(fileName.endsWith("zip")) {
			System.out.println("압축파일 입니다.");
		}else {
			System.out.println(("파일입니다."));
		}
		
		
		//startsWith(String msg) : msg문자열로 시작하면 true, 그렇지 않으면 false
		String url = "http://www.naver.com";
		String path =  "/new/ssss.do?id=123";
		if(path.startsWith("/news")) {
			System.out.println("뉴스페이지 입니다.");
		}else if(path.startsWith("/sports")) {
			System.out.println("스포츠 페이지 입니다.");
		}else {
			System.out.println("페이지가 존재하지 않습니다.");
		}
		
		//equalsIgnoreCase(Object) : 대소문자를 구분하지 않고, 문자열을 비교하여 같으면 true
		boolean success = fileName.equalsIgnoreCase("abcd.DOC");
		System.out.println(success);
		
		//indexOf(String msg) : msg문자열의 위치를 인덱스로 반환.
		int index = ssn.indexOf("-");
		System.out.println(index);
		
		//lastIndexOf(String msg) : msg 문자열의 위치를 마지막에서 시작하여 찾고
		//index는 처음부터 msg문자열까지 index를 반환.
		fileName = "abc.abc.abc.abc.doc";
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf("."));
		
		//배열의 길이 : length, 문자열의 길이 : length()
		//trim : 앞뒤 문자열 공백제거(문자열을 받아오면 항상  trim을 해라!)
		String dbId = "ay91911".trim();
		String userId = "ay91911 ".trim();
		System.out.println(dbId);
		System.out.println(userId);
		System.out.println(dbId.length());
		System.out.println(userId.length());
		System.out.println(dbId.equals(userId));
		
		//substring(int first, int last) : first(포함)부터 last(포함하지 않음)사이의 문자열을 추출 
		//substring(int first) : first(포함)보다 큰 모든 문자열을 추출
		//substring은 indexOf, lastIndecOf와 많이 쓰임.
		//보통 매개변수에 숫자를 넣지 않고, indexOf를 넣는다.
		fileName = "abc.abc.abc.doc";
		String first = fileName.substring(0, fileName.lastIndexOf("."));
		String last = fileName.substring(fileName.lastIndexOf(".")+1);
		System.out.println(first);
		System.out.println(last);
		
		//replaceAll(String regex, String replace): regex문자열을 replace문자열로 대체
		String html = "안녕하세요.\n저는 유아영입니다.\n잘 부탁드립니다.";
		html = html.replaceAll("\n", "<br>");
		System.out.println(html);
		
		//toUpperCase(): 대문자로 변환
		String m1 = "hello";
		m1 = m1.toUpperCase();
		System.out.println(m1);
		
		//toLowerCase(): 소문자로 면환
		m1 = m1.toLowerCase();
		System.out.println(m1.toString());
		
		//String.valueOf(~) : primitive type data를 문자열로 변환
		String msg = String.valueOf(1);
		System.out.println(msg);

		char[] c1 = {'a','b','c'};
		String msg2 = String.valueOf(c1);
		System.out.println(msg2);
		
		//split
		String[] str = ssn.split("-");
		String ssn1 = str[0];
		String ssn2 = str[1];
		
		System.out.println(ssn1);
		System.out.println(ssn2);
		
		//format
		String str2 = String.format("%,.2f", 123123.4567);//,=>숫자 사이에 콤마찍어줌/.2=>소수 두쨰짜리까지만,,(반올림됨)
		System.out.println(str2);
		
		str2 = String.format("%3$,20.2f%n %,.2f%n %1$,20.2f%n",1234.4590, 123345.5680, 34234.5690);
		System.out.println(str2);
				
	}

}
