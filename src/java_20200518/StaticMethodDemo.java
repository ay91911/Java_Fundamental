package java_20200518;

public class StaticMethodDemo {
	String name;
	static double interestRate;
	//instance 메서드에서는 instance 변수, static 변수 모두 사용 가능.
	//instance 메서드에서는 instance 메서드, static 메서드 모두 호출 가능.
	public void m1() {
		this.name = "유아영";//변수앞에 레퍼런스를 붙여줘야함=>this // this 자기 자신 객체(생략가능)
		StaticMethodDemo.interestRate = 4.2;//변수앞에 레퍼런스를 붙여줘야함 => 클래스이름
		this.m2();
		StaticMethodDemo.m4();
	}
	public void m2() {
		System.out.println("m2() 인스턴스 메서드 호출");
	}
	
	public static void m3() {
		//static 메서드에서는 static변수만 사용가능, instance변수 사용 불가
		//static 메서드에서는 static메서드만 호출 가능, instance메서드 호출 불가
		//static 메서드에서는 this를 사용할 수 없음.
		//(오류)name ="홍길동";
		interestRate = 3.9;//(같은 클래스 안에 있기 떄문에, 변수앞에 클래스이름 레퍼런스 생략해도 가능)
		//(오류)m2();
		StaticMethodDemo.m4();
		
		//static 메서드에서 instance 변수와 instance 메서드를 호출하려면 객체를 생성해서 사용해야 한다.		
		StaticMethodDemo m1 = new StaticMethodDemo();
		m1.name = "홍길동";
		m1.m2();
	}
	public static void m4() {
		System.out.println("m4() static 메서드 호출");
	}
	
	//main 안에 잇는 것만 실행 가능!!
	public static void main(String[] args) {
		StaticMethodDemo.m4();
		StaticMethodDemo.m3();
		StaticMethodDemo.interestRate = 4.3;
		
		StaticMethodDemo m = new StaticMethodDemo();
		m.m1();
		m.m2();
		m.name = "손정의";
	}

}
