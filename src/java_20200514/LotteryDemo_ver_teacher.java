package java_20200514;

public class LotteryDemo_ver_teacher {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i=0;i<lotto.length;i++) {
			int random = (int) (Math.random() * 45) + 1;
			
			//중복되는 값이 있는지 체크하는 변수
			boolean isExisted = false;
			
			//중복 체크하는 코드
			for(int j=0;j<i;j++) {
				if(lotto[j]==random) {
					isExisted = true;
					break;
				}
			}
			if(!isExisted) {
				lotto[i] = random;
				
			}else{
				i--;
			}
		}
		
		for (int value : lotto) {
			System.out.print(value + "\t");

		}
	}

}
