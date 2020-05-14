package java_20200513;

public class ForDemo {
	public static void main(String[] arge) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.printf("1부터 10까지의 합은 %d 입니다.%n", sum);
		/*
		 * printf=> %d자리에 값(int)이 들어감 %f자리에 값(double)이 들어감 %s자리에 값(문자열)이 들어감
		 * 
		 */
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.printf("1부터 10까지 짝수 합은 %d 입니다.%n", sum);

		// 구구단
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d = %d%n", i, j, i * j);
			}

		}
		// 9>8>7>...>2단까지
		for (int i = 9; i >= 2; i--) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d = %d%n", i, j, i * j);

			}
		}

		/*
		 
		 *
		 ** 
		 ***
		 ****
		 *****
		 
		 */

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 
		 *****
		 **** 
		 ***
		 ** 
		 * 		
		  
		 */
		//내 답
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//쌤 답
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		/*
		     *
		    **
		   ***
		  ****
		 *****
		 
		 */
		//내 답
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//쌤답
		for (int i = 0; i < 5; i++) {
			//이렇게 m,n으로 변수 선언을 해줘야 알아보기 쉽다.
			int m = 5-(i+1);
			int n = i+1;
			for (int j = 0; j < m; j++) {
				System.out.print(" ");
							
			}
			for (int j = 0; j < n; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		/*
		 *****
		  ****
		   ***
		    **
		     *
		 */
		//내 답
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
