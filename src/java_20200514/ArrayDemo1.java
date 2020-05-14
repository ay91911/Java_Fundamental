package java_20200514;

public class ArrayDemo1 {
	public static void main(String[] args) {
		
		int[] a =new int[4];
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		
		for(int i=0; i<a.length;i++) {
			System.out.println(a[1]);
		}
		System.out.println();
		
		int[] b = {100,200,300,400,500};
		
		b[0] = 101;
		b[1] = 201;
		b[2] = 301;
		b[3] = 401;
		b[4] = 501;
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println();
		
		for(int value : b) {
			System.out.println(value);
		}
		
		System.out.println(a[0]);
		
		int[]c = a;
		c[0] = 11;
		
		System.out.println(a[0]);
		System.out.println(c[0]);
	
	
	}
	
	

}
