package java_20200518;

public class MethodDemo1 {
	
	public boolean isLeafYear(int year) {
		boolean isLeaf = year%4==0 && year%100!=0 || year%400==0;
		return isLeaf;
	}
	
	public long plus(int first, int second) {
		return (long)first+(long)second;
	}
	public double divide(int first, int second) {
		return (double)first/(double)second;
	}
	public void println(String message) {
		System.out.println(message);
	}
	
	public int[] ascendint(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - (i + 1); j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;		
	}
	
	public static void main(String[] args) {
		MethodDemo m = new MethodDemo();
		boolean test = m.isLeafYear(2400);
		if(test) {
			m.println("윤년입니다.");
		} else {
			m.println("윤년이 아닙니다.");
		}

		long result = m.plus(1000000, 12312331);
		System.out.println(result);// println메서드는 String으로 반환타입을 선언했기에, long일 경우는 해당 메서드를 사용할 수 없음.

		double result2 = m.divide(12, 5);
		System.out.println(result2);

		int[] temp = { 1, 34, 9, 2, 40, 5, 45 };
		for (int value : temp) {
			System.out.print(value + "\t");
		}
		
		m.println("");
		
		int[] result3 = m.ascending(temp);
		for (int value : result3) {
			System.out.print(value + "\t");
		}
		
	}

}
