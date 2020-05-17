package java_20200515.bb;
import java_20200515.aa.Notice;
public class NoticeDemo_extends extends Notice {
	
		public static void main(String[] args) {
						
			//부모 클래스인 Notice에서 접근할 수 있는 접근 한정자는 public, protected는 접근 가능
			NoticeDemo_extends n2 = new NoticeDemo_extends();
			n2.number = 3;
			n2.title ="제목";
			
			//default는 같은 패키지 내에서만 접근 가능
			//n2.hit =100;
			
			//private은 같은 클래스 내에서만 접근 가능
			//n2.regdate = "2020-05-15";
			
		}

}
