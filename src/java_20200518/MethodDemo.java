package java_20200518;

public class MethodDemo {// 해당 class에는 isLeafYear, plus, divide, println의 네개의 instance 메소드가 있음.
	// 8-12라인까지 메서드를 정의
	// 해당 메서드의 반환값 => boolean
	// instance 메서드(반환값유형 앞에 아무 메서드 종류도 오지 않았음)
	// int year => 매개변수(parameter)
	public boolean isLeafYear(int year) {
		// 메서드의 반환값이 boolean이기 때문에 return value의 value 도 boolean이어야 한다.
		boolean isLeaf = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		return isLeaf;
	}

	public long plus(int first, int second) {
		return (long) first + (long) second;// return (long)first+second;한쪽에만 써줘도 가능
	}

	public double divide(int first, int second) {
		return (double) first / (double) second;// return (double)first/second;한쪽에만 써줘도 가능
	}

	public void println(String message) {// 반환값이 없는 메서드
		System.out.println(message);
	}

	public int[] ascending(int[] array) {
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
		MethodDemo m = new MethodDemo();//메서드를 사용하기 위해서는 객체를 반드시 만들어야함.
		boolean test = m.isLeafYear(2400);// 2400=>아규먼트(Argument)
		if (test) {
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
