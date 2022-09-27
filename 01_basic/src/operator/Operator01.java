package operator;

import java.text.DecimalFormat;

public class Operator01 {

	public static void main(String[] args) {
		int a = 1234;
		DecimalFormat df = new DecimalFormat();
		System.out.println("현금 "+ df.format(a)+"원");
		System.out.println("천의자리 : "+ a/1000);
		System.out.println("백의자리 : "+ a%1000/100);
		System.out.println("십의자리 : "+ a%1000%100/10);
		System.out.println("일의자리 : "+ a%1000%100%10);
		

	}

}
/*
[문제] 현금이 5738원이 있다, 각자리별로 출력하시오

[실행결과]
현금 5,738원
천의 자리 : 5
백의 자리 : 7
십의 자리 : 3
일의 자리 : 8
*/