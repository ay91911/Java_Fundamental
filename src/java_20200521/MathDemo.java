package java_20200521;

public class MathDemo {
	public static void main(String[] args) {
		//1.double ceil(double d)
		double d1= Math.ceil(4.2);
		System.out.println(d1);
		
		//2.double floor(double d)
		d1 = Math.floor(4.9);
		System.out.println(d1);
		
		//3.long round(double d)  or  int round(float f)
		long l1 = Math.round(42.5);
		System.out.println(l1);
		
		int a1 = (int)Math.round(43.5);
		
		//소숫점 2자리에서 반올림하기
		d1 = 45.67;
		d1 = d1*10;
		l1 = Math.round(d1);
		d1 = (double)l1/10;
		
		System.out.println(d1);
		
		//double abs(doubld d) => double 자리에 float, int, long 다 됨
		a1 = Math.abs(-123);
		System.out.println(a1);
		
		//double sqrt(double d1)
		d1 = Math.sqrt(3);
		System.out.println(d1);
		
		//double pow(double d1, double d2)
		d1 = Math.pow(2, 3);
		System.out.println(d1);
		
		//double random()
		d1 = Math.random();
		System.out.println(d1);
		
	}

}
