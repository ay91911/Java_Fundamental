package java_20200518;

public class Calendar {
	private int year;
	private int month;
	private int day;
	
	//year에 대한 Setter 메서드
	//setter 메서드를 이용하여 year를 변경한다.
	public void setYear(int year) {
		this.year = year;//멤버변수와 로컬변수가 중복될 때 this로 구분
	}

	//year에 대한 getter 메서드
	//getter 메서드를 이용하여 year을 가져온다.
	public int getYear()
	{
		return year;
	}
	//this.: 자기 자신 객체
	//로컬변수와 멤버변수를 구분할 때 사용한다. ex) this.year(멤버변수) = year(매개변수);
	public void set(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	private int getCount() {
		int totalCount = 0;

		int preYear = year - 1;

		// 2019 년 총 일수
		totalCount = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);

		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// monthArray배열에서 year이 윤년인지 아닌지를 판단하여 윤년이면 monthArray의 두번째 방의 값을 29로 변경해야 한다.

		// 4의 배수는 윤년이고, 100의 배수는 윤년이 아니고, 400의 배수는 윤년이다.
		boolean isLeafYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		if (isLeafYear) {
			monthArray[1] = 29;
		}

		// 2020년 1~4월 총 일수
		for (int i = 0; i < month - 1; i++) {
			totalCount += monthArray[i];
		}
		// primitive변수로서 구할때는 이렇게 할 수 밖에 없음 => totalCount += 31+29+31+30;

		// 2020년 5월 1일~12일 총 일수
		totalCount += day;

		return totalCount;
	}

	public void print() {

		int totalCount = getCount();

		int rest = totalCount % 7;

		String message = null;
		if (rest == 1) {
			message = "월요일";
		} else if (rest == 2) {
			message = "화요일";
		} else if (rest == 3) {
			message = "수요일";
		} else if (rest == 4) {
			message = "목요일";
		} else if (rest == 5) {
			message = "금요일";
		} else if (rest == 6) {
			message = "토요일";
		} else {
			message = "일요일";
		}
		System.out.println(year + "년" + " " + month + "월" + " " + day + "일은" + " " + message + "입니다.");
	}

}
