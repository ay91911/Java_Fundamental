package java_20200515;

public class CustomerStaticDemo {
	public static void main(String[] args) {
		Customer c1 =new Customer();
		c1.name = "홍길동";
		//static 변수
		//1. 모든 객체가 공통으로 사용할 수 있는 변수
		//2. 레퍼런스(c1,c2)로 접근하지 않고 클래스 이름으로 접근한다.
		Customer.interestRate = 30.45;
		
		Customer c2 = new Customer();
		c2.name= "아무개";
		Customer.interestRate = 12.25;
		// static변수는 개체 안에 있지 않기에, 마지막으로 할당된 값으로 적용된다.
		System.out.println(Customer.interestRate);//12.25
		
		
		//Customer.BANKNAME = "국민은행"; => BANKNAME이 final변수이기 때문에 오류발생.
	}

}
