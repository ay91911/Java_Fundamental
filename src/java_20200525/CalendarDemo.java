package java_20200525;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();//지금현재시간
		
		cal.setTimeInMillis(1589168363341l);//알기 원하는  밀리세컨드시간
				
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;//MONTH는 0부터 카운트..
		int day = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year+","+month+","+day);
		System.out.println(hour+","+minute+","+second);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E요일");
		String date = sdf.format(cal.getTime());
		System.out.println(date);
	}

}
