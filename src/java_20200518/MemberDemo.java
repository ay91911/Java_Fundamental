package java_20200518;

public class MemberDemo {
	public static void main(String[] args) {
		Member m = new Member();
		//(오류)m.name ="유아영";
		//(오류)System.out.println(m.name);
		
		m.setName("유아영");
		m.setZipcode("01234");
		m.setAddr1("서울");
		m.setAddr2("강서구");
		m.setSsn1("1111");
		m.setSsn2("2222");
		m.setAge(28);
		m.setRegdate("2020-05-18");
		
		System.out.println(m.getName());
		System.out.println(m.getZipcode());
		System.out.println(m.getAddr1());
		System.out.println(m.getAddr2());
		System.out.println(m.getSsn1());
		System.out.println(m.getSsn2());
		System.out.println(m.getAge());
		System.out.println(m.getRegdate());
		
	}

}
