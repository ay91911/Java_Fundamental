package java_20200515;

public class ArrayCopyDemo1 {
	public static void main(String[] args) {
		String[] fruits = {"apple","banana","watermelon","blueberry"};
		String[] temp = new String[6];
		
		System.arraycopy (fruits,0,temp,2,4);
		temp[0]="peach";
		temp[1]="pear";
		
		for(int i=0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
		
		for(String value : temp) {
			System.out.println(value);
		}
	}

}
