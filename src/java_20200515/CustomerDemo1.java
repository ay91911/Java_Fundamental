package java_20200515;

public class CustomerDemo1 {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		
		c1.name ="유아영";
		c1.email = "ay91911@gamil.com";
		c1.phone = "010-9131-2930";
		c1.balance = 1_000_000;
		c1.isReleased = false;
		
		System.out.println(c1.name);
		System.out.println(c1.email);
		System.out.println(c1.phone);
		System.out.println(c1.balance);
		System.out.println(c1.isReleased);

		
		Customer c2 = new Customer();
		c2.name = "손정의";
		c2.email = "son@softbank.com";
		c2.phone = "010-9090-8097";
		c2.balance = 100_000_000;
		c2.isReleased = false;
		
		System.out.println(c2.name);
		System.out.println(c2.email);
		System.out.println(c2.phone);
		System.out.println(c2.balance);
		System.out.println(c2.isReleased);
		
		Customer c3 = c2;
		c3.name = "손마사요시";
		System.out.println(c2.name);
		
	}

}