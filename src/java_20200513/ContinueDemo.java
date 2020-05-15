package java_20200513;

public class ContinueDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i == 6) continue;
			sum += i;
		}
		System.out.printf("1부터 10까지 합은 %d입니다.(단 6은 제외한다.)%n", sum);
		//여기에 'if(true) return;'를 쓰면 이 밑에 있는 문장들은 실행안되고 종료됨.
		outer: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5) continue outer;
				System.out.printf("%d*%d=%d%n", i, j, i * j);
			}
		}
	}
}
