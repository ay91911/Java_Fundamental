package java_20200514;

public class TwoArrayDemo {
	public static void main(String[] args) {

		// 배열 선언 및 생성
		int[][] a = new int[3][2];

		// 배열 할당
		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		a[2][0] = 50;
		a[2][1] = 60;

		// 배열 선언 및 생성과 할당 동시에!
		int[][] b = { { 10, 20 }, { 30, 40 }, { 50, 60 } };

		// 배열 출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}

		// 2차원 배열(동적)
		int[][] c = new int[4][];
		c[0] = new int[1];
		c[1] = new int[2];
		c[2] = new int[3];
		c[3] = new int[4];
		c[0][0] = 1;
		c[1][0] = 2;
		c[1][1] = 3;
		c[2][0] = 4;
		c[2][1] = 5;
		c[2][2] = 6;
		c[3][0] = 7;
		c[3][1] = 8;
		c[3][2] = 9;
		c[3][3] = 10;

		// => int[][]a={{1},{2,3},{4,5,6},{7,8,9,10}};

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.println(c[i][j]);
			}
		}
		for (int[] test : c) {
			for (int value : test) {
				System.out.println(value);
			}
		}

	}

}
