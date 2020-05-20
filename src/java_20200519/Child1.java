package java_20200519;

public class Child1 extends Parent1{
	String chicken;
	int money;
	public void gotoSchool() {
		System.out.println("child gotoSchool");
	}
	public void play(String starcraft) {
		super.play(starcraft);
		System.out.println("Child paly "+starcraft);
	}
	
	public void setParentMoney(int money) {
		super.money = money;
	}
	
	public int getParentMoney() {
		return super.money;
	}

}
