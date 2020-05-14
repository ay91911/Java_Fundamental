package java_20200513;

public class BreakDemo1 {
	public static void main(String[] agrs) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i == 6)
				break;
			sum += i;
		}
		System.out.printf("1부터 5까지의 합은 %d 입니다.%n", sum);

		outer: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == 5 && j == 6)
					break outer;
				System.out.printf("%d*%d=%d%n", i, j, i * j);

			}

		}
	}
}
