
package homework;

public class homework_200517 {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		System.out.println("1부터100까지 소수는 ");
		con : for(int i=2;i<=100;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) continue con;
			}
			System.out.println(i);
			count ++;
			sum += i;
		}
		System.out.println("입니다.");
		System.out.println("1부터100까지 소수의 개수는 "+count+"입니다.");
		System.out.println("1부터100까지 소수의 합은 "+sum+"입니다.");
	}
}

