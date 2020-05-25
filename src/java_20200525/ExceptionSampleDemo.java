package java_20200525;

public class ExceptionSampleDemo {
	public static void main(String[] args) {
		
		//1. NullPointerExcepntion 예외 발생
		//String msg = null;
		//int msgLength = msg.length();
		//System.out.println(msgLength);
		
		//2. ArrayIndexOutOfBoundsException 예외 발생
		//int[] array = {1,2,3};
		//int temp = array[3];
		
		//3. ArithmeticException 예외발생
		//int result = 3/0;
		//System.out.println(result);
		
		//4. NumberFormatException 예외 발생
		int first = Integer.parseInt("a");
		System.out.println(first);
		
		
		
		
	}

}
