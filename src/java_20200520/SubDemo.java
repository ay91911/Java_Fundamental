package java_20200520;

public class SubDemo {
	public static void main(String[] args) {
		Super s1 = new Super();
		System.out.println(s1.age);
		s1.playBadook();
		s1.work();
		
		System.out.println("============================");
		Sub s2 = new Sub();
		System.out.println(s2.height);
		s2.playGame();
		s2.work();//=>자식꺼가 호출됨
		
		s2.age = 20;
		System.out.println(s2.age);;
		s2.playBadook();
		
		System.out.println("============================");
		//객체의 형변환(추상클래스의 객체 생성하기 위해 필요)
		Super s3 = new Sub();
		System.out.println(s3.age);
		s3.playBadook();
		s3.work();
		
		//s3.height = 20;
		//s3.playGame();
		
		System.out.println("============================");
		Super s4 = s2;
		System.out.println(s4.age);
		s4.playBadook();
		s4.work();
		
		//s4.height = 20;
		//s4.playGame();
	}

}
