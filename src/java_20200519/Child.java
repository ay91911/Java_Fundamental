package java_20200519;

public class Child extends Parent {
	String chicken;
	int money;
	public void gotoSchool() {
		System.out.println("child gotoSchool()");
	}
	
	public void play(String starcraft) {
		super.play(starcraft);//부모꺼 대로 놀고(보통은 재정의할때 생략)
		System.out.println("Child play()");//내가 노는대로도 놀고
	}
	
	//자식,부모 간 instance변수가 충돌할 경우 자식 변수로 가져옴.
	//이때 부모 변수를 가져오려면 아래와 같이 "super."를 활용.
	public void setParentMoney(int money) {
		super.money = money;
	}
	
	public int getParentMoney() {
		return super.money;
	}

}
