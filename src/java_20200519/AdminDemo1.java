package java_20200519;

public class AdminDemo1 {
	public static void main(String[] args) {
		
		Admin1 a = new Admin1("ay91911","1111","ay91911@gmail.com",1);
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		
		Admin1 a1 = new Admin1("ay9191","1112","ay91912@gmail.com");
		
		System.out.println(a1.getId());
		System.out.println(a1.getPwd());
		System.out.println(a1.getEmail());
		System.out.println(a1.getLevel());
	}

}
