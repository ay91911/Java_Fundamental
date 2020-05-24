package java_20200518;

public class StaticMethodDemo1 {
	String name;
	static double interestRate;
	public void m1() {
		this.name = "유아영";
		StaticMethodDemo1.interestRate = 4.2;
		this.m2();
		StaticMethodDemo1.m4();		
	}
	public void m2() {
		System.out.println("m2() 인스턴스 메서드 호출");		
	}
	
	public static void m3() {
		//name = "홍길동";
		interestRate = 3.9;
		//m2();
		StaticMethodDemo1.m4();
		
		StaticMethodDemo1 m1 = new StaticMethodDemo1();
		m1.name = "홍길동";
		m1.m2();
	}
	public static void m4() {
		System.out.println("m4() static 메서드 호출");
	}
	
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
