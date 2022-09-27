package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		int pay,bonus,sum,salary,tax, per;
		DecimalFormat df = new DecimalFormat();
		String name,rank;
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		System.out.print("\n직급 입력 : ");
		rank = sc.nextLine();
		System.out.print("\n기본급 입력 : ");
		pay = sc.nextInt();
		System.out.print("\n수당 입력 : ");
		bonus = sc.nextInt();
		sum = pay+bonus;
		
		per = sum>=5000000 ? 3 : sum<5000000&&sum>=3000000 ? 2 : 1;
		
		tax = sum*per/100;
		salary = sum - tax;
		System.out.println("***"+name+" "+rank+" 월급 ***");
		System.out.println("기본급 : "+df.format(pay) );
		System.out.println("수당 : "+df.format(bonus) );
		System.out.println("합계 : "+df.format(sum) );
		System.out.println("세금 : "+df.format(tax) );
		System.out.println("월급 : "+df.format(salary) );
	}

}
/*
 * [문제] 월급 계산 프로그램
 * 이름,직급,기본급,수당 입력 합계,세율,세금,월급출력
 * 단 합계가 5,000,000 원 이상 3% 
 * 		   3,000,000 원 이상 2%
 * 		   아니면 1%
 * 합계 = 기본급 + 수당
 * 세금 = 합계 * 세율
 * 월급 = 합계 - 세금
 * [실행결과]
 * 이름 입력 : 홍길동
 * 직급 입력 : 부장
 * 기본급 입력 : 4900000
 * 수당 입력 : 200000
 * 
 * *** 홍길동 부장 월급 ***
 * 
 * 기본급 : 4,900,000원
 * 수당 : 200,000원
 * 합계 : 5,100,000원
 * 세금 : ~%
 * 월급 : ~~~
 * 
 * 
 * 
 *  */
