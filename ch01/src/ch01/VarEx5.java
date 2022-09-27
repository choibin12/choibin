package ch01;

public class VarEx5 {

	public static void main(String[] args) {
		//%.?f 소수점?째자리 
//		%d 10진수 
//		%x 16진수
//		%o 8진수
//		%e 지수
//		%c 문자
//		%s 문자열
//		%b 불리언 형식으로 출력
		System.out.printf("%5d%n", 10);
		System.out.printf("[%5d]%n", 10);
		System.out.printf("[%05d]%n", 10);
		System.out.printf("[%5d]%n", 10);
		System.out.printf("[%-5d]%n", 10);
		double d = 1.23456789;
		System.out.printf("%14.10f%n", d);
		System.out.printf("%.6f%n", d);
		System.out.printf("[%-20s]%n","www.codechobo.com");
		System.out.printf("[%.10s]%n","www.codechobo.com");
	}

}
