package java_20200513;

public class ContinueDemo1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			if(i ==6) continue;
			sum +=i;
			}
		System.out.printf("1부터 10까지 합은 %d입니다. (단 6은 제외한다.)%n", sum);
		
		outer: for (int i = 2; i <=9; i++) {
			for (int j = 1; j <= 9; j++) {
				if(j == 5 ) continue outer;
				System.out.printf("%d*%d=%d%n", i,j,i*j);
				
			}
			
		}
	}

}
