package java_20200514;

public class CalendarDemo {
	 public static void main(String[] args) {
		 /*
			 * 달력만들기
			 * 1. 1년 1월 1일 월요일
			 * 2. 1년은 365일 이고, 윤년일 떄는 366일(2월29일)
			 * 3. 윤년은 4년마다 발생하고, 그 중에 100의 배수는 제외하고, 400배수는 제외하지 않는다.
			 * 4. 2020년 5월 12일은 무슨요일 일까?
			 * 5. 2019년까지 총 일수 + 2020년 4월까지 총 일수 + 12일 더해서 7로 나눈 나머지가 1이면 월요일, 2이면 화요일,.....
			 * 1년 464.24.........
			 * (2019*365 + (2019/4-2019/100+2019/400)+31+29+31+30+12)%7
			 */
			
			int year = 2020;
			int month = 5;
			int day = 12;
			int totalCount = 0;
			int rest = 0;
			int preYear = year-1;
			
			//2019 년 총 일수
			totalCount = preYear*365+(preYear/4-preYear/100+preYear/400);
			
			int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
			
			//monthArray배열에서 year이 윤년인지 아닌지를 판단하여 윤년이면 monthArray의 두번째 방의 값을 29로 변경해야 한다.
			
			/*내 답
			* if(year%4==0) {
			*	monthArray[1] = 29;
			*...100의 배수 빼고, 400의 배수 추가하는 것까지 고려해야 했음...
			*/
			
			//쌤 답
			//4의 배수는 윤년이고, 100의 배수는 윤년이 아니고, 400의 배수는 윤년이다.
			boolean isLeafYear = year%4==0 && year%100 !=0 || year%400==0;
			if(isLeafYear) {
				monthArray[1] =29;
			}
			
			//2020년 1~4월 총 일수
			for(int i=0;i<month-1;i++) {
				totalCount += monthArray[i];
			}
			//primitive변수로서 구할때는 이렇게 할 수 밖에 없음 => totalCount += 31+29+31+30;
			
			//2020년 5월 1일~12일 총 일수
			totalCount += day;
			
			rest = totalCount%7;
			
			String message = null;
			if(rest == 1) {
				message ="월요일";
			}else if(rest == 2) {
				message = "화요일";
			}else if(rest == 3) {
				message = "수요일";
			}else if(rest == 4) {
				message = "목요일";
			}else if(rest == 5) {
				message = "금요일";
			}else if(rest == 6) {
				message ="토요일";
			}else {
				message ="일요일";
			}
			System.out.println(year+"년"+" "+month+"월"+" "+day+"일은"+" "+message+"입니다.");
	}
}
