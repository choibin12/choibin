package operator;

import java.util.Scanner;

public class Home02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("영문자를 입력하십시오");
//		String a = sc.nextLine();
//		char b = a.charAt(0);//String으로받은 문자열을 문자로 변환
		char a = sc.next().charAt(0);
		int result = a>=97 ? a-32 : a+32;
		char b = (char) result;
		System.out.println("입력값 : "+a+"\t"+"변환값 : "+b);
	}

}
/*
[문제] 변수의 값이 대문자이면 소문자로 변환해서 출력, 소문자이면 대문자로 변환해서 출력하시오

[실행결과]
B -> b       e->E     A=65 a=97 -32 +32
*/