package java_20200514;

public class LotteryDemo {
	public static void main(String[] args) {
		// 로또복권
		// 1. 1부터 45까지의 숫자 중 임의 숫자 6개를 생성한다.
		// 2. 6개의 숫자 중 중복된 숫자가 나오면 안된다.
		// Math.random() => 0보다 크거나 같고 1보다 작은 양수를 double 값으로 반환한다.
		// Math.random()*45==>1~44, so 1을 더해줌=>1~45의 임의 랜덤값을 반환

		// 내 버전
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int random = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				while (random == lotto[j]) {
					random = (int) (Math.random() * 45) + 1;
				}
			}
			lotto[i] = random;

		}

		for (int value : lotto) {
			System.out.print(value + "\t");

		}

	}
}
