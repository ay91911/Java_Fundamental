package java_20200513;

public class ForDemo1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			sum +=i;
		}
		System.out.printf("1부터 10까지의 합의 %d 입니다.%n", sum);
		
		sum =0;
		for (int i = 1; i <=10; i++) {
			if(i%2 == 0) {
				sum += i;
			}
		}
		System.out.printf("1부터 10까지 짤수 합읜 %d입니다. %n", sum);
		
		for (int i = 2; i <=9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%d%n", i,j,i*j);
			}		
		}
		
		for (int i = 9; i >=2; i--) {
			for (int j = 1; j <=9; j++) {
				System.out.printf("%d*%d=%d",i,j,i*j);
				
			}
			
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print("*");		
			}
			System.out.println();
		}
		
		for (int i = 0; i <5; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.print(" ");
				}
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print(" ");				
			}
			for (int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
				System.out.println();			
		}
	}

}
