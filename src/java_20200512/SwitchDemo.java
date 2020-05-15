package java_20200512;

public class SwitchDemo {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season =null;
		//month => 수식( char, byte, short, int, String)
		switch(month) {
		//case 평가값 => 반드시 유일해야 함.
		//case 절에 break가 없으면 아래의 case로 이동한다.
		//ex)12월이어도 break없으면 흘러내려오기 때문에 중복되는 12,1월 꺼는 지워도 됨.
		case 12 : 
		case 1 : 
		case 2 : season = "겨울"; break;
		case 3 : 
		case 4 : 
		case 5 : season = "봄"; break;
		case 6 : 
		case 7 : 
		case 8 : season = "여름"; break;
		case 9 : 
		case 10 : 
		case 11 : season = "가을"; break;
		//default의 위치는 어디든 상관없음.
		//마지막 문장에 있으면 break문을 사용하지 않지만, 다른 곳에 있을 경우에는  break문을 사용해야한다.
		//(필수는 아니지만 예상 못한 결과가 발생할 수 있음)
		//즉, 맨 마지막 문장에는  break 생략가능함.
		default : season = "없는 계절"; 
		}
		System.out.println(month+"월은"+season+"입니다.");
	}
}
