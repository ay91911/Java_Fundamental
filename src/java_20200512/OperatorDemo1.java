package java_20200512;

public class OperatorDemo1 {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0;
		
		c = a+b;
		System.out.println(c);
		
		c = a-b;
		System.out.println(c);
		
		d = (double)b/a;
		System.out.println(d);
		
		c = a*b;
		System.out.println(c);
		
		c = b%a;
		System.out.println(c);
		
		a += b;
		System.out.println(a);
		
		int sum = 0;
		
		for(int i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println(sum);
		
		a = 10;
		b = 20;
		
		a++;
		++b;
		
		System.out.println(a);
		System.out.println(b);
		
		c = a++;
		System.out.println(c);
		System.out.println(a);
		
		c = ++b;
		System.out.println(c);
		System.out.println(b);
		
		a = 10;
		b = 20;
		d = 10.0;
		
		boolean isSuccess = false;
		isSuccess = a>b;
		System.out.println(isSuccess);
		
		isSuccess = a<b;
		System.out.println(isSuccess);
		
		isSuccess = a>=b;
		System.out.println(isSuccess);
		
		isSuccess = a<=b;
		System.out.println(isSuccess);
		
		isSuccess = a==b;
		System.out.println(isSuccess);
		
		isSuccess = a==d;
		System.out.println(isSuccess);
		
		isSuccess = a!=b;
		System.out.println(isSuccess);
		
		System.out.println(4&5);
		System.out.println(4|5);
		System.out.println(4^5);
		
		a = 10;
		b = 20;
		
		isSuccess = (a==b) && (++a==b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		a = 10;
		b = 10;
		
		isSuccess = (a==b) || (++a==b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(1+2+3+"456");
		System.out.println("123"+4+5+6);
		
		
				
		
	}
}
