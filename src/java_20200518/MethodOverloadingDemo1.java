package java_20200518;

public class MethodOverloadingDemo1 {
	public void print(String str) {
		System.out.print(str);
	}
	public void print(int i) {
		System.out.print(i);
	}
	public void print(double d) {
		System.out.print(d);
	}
	public void print(boolean b) {
		System.out.print(b);
	}
	
	public void test(int... a) {
		for(int temp:a) {
			System.out.println(temp);
		}
	}
	
	public static void main(String[] args) {
		MethodOverloadingDemo m = new MethodOverloadingDemo();
		m.print("hello");
		m.print(100);
		m.print(10.34);
		m.print(true);
		System.out.println();
		m.test(1);
		m.test(1,2);
		m.test(1,2,3);
	}
}
