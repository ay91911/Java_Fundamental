package java_20200519;

public class AdminDemo {
	public static void main(String[] args) {
		
		Admin a = new Admin("ay91911","1111","ay91911@gmail.com",1);
		
		//a.id = "ay91911";id가 private이기 때문에 접근 불가
		
		//a.setId("ay91911");
		//a.setPwd("1111");
		//a.setEmail("ay91911@gmail.com");
		//a.setLevel(1);
				
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());

		Admin a1 = new Admin("ay91912","1112","ay91912@gmail.com");
			
			System.out.println(a1.getId());
			System.out.println(a1.getPwd());
			System.out.println(a1.getEmail());
			System.out.println(a1.getLevel());
		
	}
}
