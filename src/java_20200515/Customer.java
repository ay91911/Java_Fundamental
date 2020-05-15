package java_20200515;
//Customer 클래스
public class Customer {
	//클래스의 멤버 변수 - instance 변수, static변수, final변수
	//인스턴스 변수(name, email, phone, balance, isRelased;)
	//객체가 생성될 때만 만들어지는 변수
	public String name;
	public String email;
	public String phone;
	public double balance;
	public boolean isReleased;
	//모든 사람의 interestRate가 같을때 static변수로 선언.
	public static double interestRate;
	//상수는 한번 정해지면 값을 변경할 수 없음.so,일반적으로 final변수로 사용. 
	//상수는 대문자로 쓰는 것이 관례.
	public static final String BANKNAME = "신한은행";

}
