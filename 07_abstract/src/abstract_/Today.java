package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Today {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println("오늘 날짜 : "+date);
		System.out.println();
		SimpleDateFormat SDF = new SimpleDateFormat("y년 MM월 dd일 E요일 HH시 mm분 ss초");//y M d E H m s 년 월 일 요일 시 분 초
		System.out.println("오늘 날짜 : "+ SDF.format(date));
		System.out.println();
		
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19960726000000"); //String -> Date 변환
		System.out.println("내 생일 "+birth);
		System.out.println("내 생일 "+SDF.format(birth));
		//Calender cal = new Calendar(); - error Calendar 가 추상클래스
//		Calendar cal = new GregorianCalendar(); //Sub Class 이용해서 생성
//		Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("Canada/Pacific"));//메소드를 이용하여 생성
		Calendar cal2 = Calendar.getInstance();
		int year = cal2.get(Calendar.YEAR);//int year = cal.get(1);
		int month = cal2.get(Calendar.MONTH)+1;
		int day = cal2.get(Calendar.DAY_OF_MONTH);
		int week = cal2.get(Calendar.DAY_OF_WEEK);
		int hour = cal2.get(Calendar.HOUR_OF_DAY); 
		int minute = cal2.get(Calendar.MINUTE);
		int second = cal2.get(Calendar.SECOND);
		String dayofweek = null;
		switch(week) {
		case 1 :dayofweek = "일요일";break;
		case 2 :dayofweek = "월요일";break;
		case 3 :dayofweek = "화요일";break;
		case 4 :dayofweek = "수요일";break;
		case 5 :dayofweek = "목요일";break;
		case 6 :dayofweek = "금요일";break;
		case 7 :dayofweek = "토요일";break;
		}
		
		System.out.println(year+"년"+month+"월"+day+"일 "+dayofweek
				+" "+hour+":"+minute+":"+second);
		
		}

}
// 1996 07 26
//Integer.parseInt 
//예외처리 Exception
//throws = 
//try ~ catch
/*ArrayIndexOutOfBoundException<--- 배열번호초과
 * NullPointerException <- 빈값
 * 
 */
