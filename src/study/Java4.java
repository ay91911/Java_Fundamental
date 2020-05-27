package study;

import java.util.ArrayList;

public class Java4 {
	private String name;
	private double height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	//생성자
	Java4(String name, double height){
		this.name=name;
		this.height=height;
	}
	
	Java4(String name){
		this.name=name;
	}
	
	Java4(){
		
	}
	
	//메소드
	public long plus(int first, int second) {
		return (long)first+(long)second;
	}
	
	//메소드의 오버로딩
	//메소드의 이름은 같지만, 매개변수의 개수나 자료형이 달라야 함.
	public void print() {
		System.out.println(name + ","+height);
	}
	public void print(String msg) {
		System.out.println(msg);
	}
	public void pring(int msg) {
		System.out.println(msg);
	}
	
	
	public ArrayList<Customer>list(){
		ArrayList<Customer>list = new ArrayList<Customer>();
		//Customer c1 = new Customer("유아영1");
		//list.add(c1);
		
		list.add(new Customer("유아영1"));
		list.add(new Customer("유아영2"));
		list.add(new Customer("유아영3"));
		list.add(new Customer("유아영4"));
		
		return list;
	}
	
	//main 함수
	public static void main(String[] args) {
		//ArrayList 선언 및 호출
		Java4 j = new Java4();
		ArrayList<Customer>list1 = j.list();
		//출력
		for(Customer cust: list1) {
			System.out.println(cust.name);
		}
		
		//이렇게 접근하자!
		//생성자로 바로 값 할당
		//값 가져오거나, 변경할때 get,set 메서드로!
		Java4 j1 = new Java4("a1",160.2);
		//j1.name = "a1";
		//j1.height = 160.2;
		System.out.println(j1.getName());
		System.out.println(j1.getHeight());
		j1.print();
		j1.setName("a2");
		long result = j1.plus(10,20);
		System.out.println(result);
		
		//j2처럼 하지말라고오오오..하급
		Java4 j2 = new Java4();
		j2.name = "a2";
		j1.height = 170.9;
		System.out.println(j2.name);
		System.out.println(j2.height);
		j2.print();
		long result2 = j2.plus(100,20);
		System.out.println(result2);
		
		Java4 j3 = new Java4("a3");
		//j3.name = "a3";
		j3.height = 180.4;
		System.out.println(j3.name);
		System.out.println(j3.height);
		j3.print();
		long result3 = j3.plus(10,200);
		System.out.println(result3);
		
		//새로운 객체 생성 ㄴㄴ, just 기생성된 객체 참조!
		Java4 j4 = j1;
		
	//112~114 라인 => 116라인 하나로 표현 가능
		Java4 j5 = new Java4("a4",190.1);
		double height = j5.getHeight();
		System.out.println(height);
		
		System.out.println(new Java4("a4",190.1).getHeight());
		
		
		
		
		
		
		
	}

}
