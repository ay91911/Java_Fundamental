package java_20200514;

public class LotteryDemo_ver_teacher1 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int random = (int) (Math.random() * 45) + 1;

			boolean isExisted = false;

			for (int j = 0; j < i; j++) {
				if (lotto[i] == random) {
					isExisted = true;
					break;
				}
			}
			if (!isExisted) {
				lotto[i] = random;
			} else {
				i--;
			}

		}
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length - (i + 1); j++) {
				if (lotto[j] > lotto[j + 1]) {
					int temp = lotto[j + 1];
					lotto[j + 1] = lotto[j];
					lotto[j] = temp;
				}
			}

		}
		for (int value : lotto) {
			System.out.print(value + "\t");

		}
	}
}
