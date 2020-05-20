package java_20200519;

public class ChildDemo1 {
	public static void main(String[] args) {
		Parent1 p = new Parent1();
		p.money=1_000_000_000;
		p.makeMoney();
		p.play("baduk");
		
		System.out.println(p.money);
		
		Child1 c = new Child1();
		c.money = 1_000_000_000;
		c.setParentMoney(1_000_000);
		c.chicken = "교촌통닭";
		c.gotoSchool();
		c.makeMoney();
		c.play("omok");
		
		System.out.println(p.money);
		System.out.println(c.getParentMoney());
		System.out.println(c.chicken);
	}

}
