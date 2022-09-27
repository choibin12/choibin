package if_;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println("a의 값 : "+a);
		System.out.println("b의 값 : "+b);
		System.out.println("c의 값 : "+c);
		if (a>b&&b>c) {
			System.out.println(a+"\t"+b+"\t"+c);
		} else if (a>c&&c>b) {
			System.out.println(a+"\t"+c+"\t"+b);
		} else if (b>a&&a>c) {
			System.out.println(b+"\t"+a+"\t"+c);
		} else if (b>c&&c>a) {
			System.out.println(b+"\t"+c+"\t"+a);
		} else if (c>a&&a>b) {
			System.out.println(c+"\t"+a+"\t"+b);
		} else if (c>b&&b>a) {
			System.out.println(c+"\t"+b+"\t"+a);
		}
	}
}
/*
3개의 숫자 abc를 입력받아 순서대로 출력
[실행결과]
a의 값 : 98
b의 값 : 90
c의 값 : 85

85 90 98

a의 값 : 75
b의 값 : 25
c의 값 : 36

25 36 75
*/