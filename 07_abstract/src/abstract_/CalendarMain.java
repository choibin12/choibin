package abstract_;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Scanner;
class Cal{
	int year;
	int month;
	int weekday;
	int lastday;
	Scanner sc = new Scanner(System.in);
	Cal(){
	System.out.print("년도 입력 : ");
	year = sc.nextInt();
	System.out.print("월 입력 : ");
	month = sc.nextInt();
	}
	void calc(){
	Calendar cal = Calendar.getInstance();//시스템시간으로 현재시간
	
    cal.set(Calendar.YEAR,year);//년 입력
    cal.set(Calendar.MONTH, month-1);//월 입력
    cal.set(Calendar.DAY_OF_MONTH,1);//1일로 세팅
    weekday = cal.get(Calendar.DAY_OF_WEEK);//입력한 년,달의 첫요일
    lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);//입력한 년,달의 마지막날
	}
	void display() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=1; i<weekday; i++) {//첫요일까지 탭
			System.out.print("\t");
		}
		for(int i=1; i<=lastday; i++) {
			System.out.print(i+"\t");
			
			if((i+weekday-1)%7==0) {//토요일에 sysout
				System.out.println();
			}
		}
	}
}
public class CalendarMain {
	
	public static void main(String[] args) {
		Cal c = new Cal();
		c.calc();
		c.display();
	}

}
/*
[문제] 만년달력
- 년도, 월을 입력하여 달력을 작성하시오
- 기본생성자 : 입력
- 메소드 : calc() -> 매달 1일의 요일이 무엇인지? (Calendar에 메소드 준비)
                -> 매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드 준비)
         display() 출력

[실행결과]
년도 입력 : 2002
월 입력 : 10   

일   월   화   수   목   금   토
      1   2   3   4   5
6   7   8   9   10   11   12
13   14   15   16   17   18   19
20   21   22   23   24   25   26
27   28   29   30   31
 */