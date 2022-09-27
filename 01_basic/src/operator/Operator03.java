package operator;

import java.util.Scanner;
//짝수는 2로 나누면 나머지 0
//2와 3의 공배수 = 2와 3으로 둘다 나누어떨어짐
public class Operator03 {

	public static void main(String[] args) {
			int a;
			Scanner sc = new Scanner(System.in);
			System.out.print("정수를 입력하시오 : ");
			a = sc.nextInt();
			String result = a%2==0 ? "짝수" : "홀수";
			String result2 = a%2==0 && a%3==0 ? a+"는 2와 3의 공배수" : a+"는 2와 3의공배수가 아니다";
			System.out.println(result);
			System.out.println(result2);
			
		
	}

}
/*
[문제]
정수를 입력하여 짝수인지 홀수인지 구분

[실행결과]
정수를 입력하시오 : 12
12는 짝수
12는 2 와 3의 공배수
---------------------
정수를 입력하시오 : 15
15는 홀수
15는 2 와 3의 공배수가 아니다
*/