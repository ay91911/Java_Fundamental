package java_20200522;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//자동 임포트 => ctrl+shift = o(영문자)
		//HashSet : 객체의 중복을 허용하지 않고, 순서도 없음.
		
		//1. 선언 및 생성
		HashSet<Integer> set = new HashSet<Integer>();//=>제너릭 선언 : <Integer>를 작성하면 데이터를 integer값만 넣을 수 있도록 함.
		//일정한 객체를 넣지 않아도 자동으로 형변환되니 출력될때 문제되지 않게 하기 위하여..
		//예를들어 값을 넣을때 "1"라고 써도 자동형변환되지만, 출력하는건 integer이기 때문에 문제가 생김.
		
		//할당
		set.add(1);//auto boxing=> primitive값을 자동으로 wrapping
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1);
		
		System.out.println(set.size());
		
		//3. 출력
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()) {
			Integer number = i.next();
			System.out.println(number);
		}
		
		HashSet<Customer> set1 = new HashSet<Customer>();
		
		set1.add(new Customer("유아영1"));
		set1.add(new Customer("유아영2"));
		set1.add(new Customer("유아영3"));
		set1.add(new Customer("유아영1"));//서로다른 객체지만 값이 같으면 같다는 것으로 하기 위해 equals, hashcode 오버라이딩함.
		
		System.out.println("size: "+ set1.size());
		
		
		//로또 복권 - HashSet
		
		//TreeSet - 객체의 중복을 허용하지 않음, 오름차순 정렬해줌
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		while(true) {
			int random = (int)(Math.random()*45) + 1;
			lotto.add(random);
			if(lotto.size() == 6)break;
		}
		
		Iterator<Integer> iter = lotto.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + "\t");
		}
		
		
		
		
		
		
		
		
	}

}
