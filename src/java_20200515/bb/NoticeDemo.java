package java_20200515.bb;
//다른 패키지에 있는  class를 끌어오고 싶을땐, import!!
import java_20200515.aa.Notice;
public class NoticeDemo {
	public static void main(String[] args) {
		Notice n1 = new Notice();
		n1.number =2;
		
		//protected은 서로 다른 패키지일 경우에는 상속 받으면 접근 가능.
		//n1.title ="제목";
		
		//default는 같은 패키지 내에서만 접근 가능
		//n1.hit =100;
		
		//private은 같은 클래스 내에서만 접근 가능
		//n1.regdate = "2020-05-15";
	}

}
