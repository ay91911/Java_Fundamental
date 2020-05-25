package java_20200525;

public class TryCatchDemo {

	public static double getAvg(int first, int second) {
		int sum = first + second;
		double avg = (double) sum / 2;
		return avg;
	}

	public static void main(String[] args) {
		//Run Configurations => Argument => program Arguments : 값 넣는 방법
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);
		
			double average = getAvg(korean, english);
			System.out.printf("평균 : %f",average);
		}catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println("예외 메세지: "+e.getMessage());
			//System.err.println("2개 넣어!");
			/*
			 * 일반출력: System.out
			 * 에러출력: System.err
			 */
			e.printStackTrace();//개발도중에 많이 쓰임
		}catch(NumberFormatException e) {
			//System.out.println("예외 메세지: "+ e.getMessage());
			System.out.println("문자말고 숫자 넣어!");
			//e.printStackTrace();
		}
		
		finally {
			System.out.println("finally");
		}
		
		//catch 블럭이 여러 있을 경우, 위에서 부터 하위 클래스 => 상위 클래스 순으로 정한다.
		
	
	}

}
