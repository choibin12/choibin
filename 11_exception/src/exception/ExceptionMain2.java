package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain2 {
	int x;
	int y;
	int result = 1;
	Scanner sc = new Scanner(System.in);
	void input() {
		try {
			System.out.print("x 입력 : ");
			x = sc.nextInt();
			System.out.print("y 입력 : ");
			y = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력하시오");
		}
	}
	void output(){
		if (y>=0) {
			for(int i = 0; i<y; i++) {
				result *= x;
			}
			System.out.println(x+"의 "+y+" 승은 "+result);
		}
		else {
			//			System.out.println("y는 0보다 크거나 같아야 한다");
			try {
				throw new Exception("y는 0보다 크거나 같아야 한다");
				//개발자가 강제로 exception 발생
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args)  {
		ExceptionMain2 EM = new ExceptionMain2();
		EM.input();
		EM.output();

	}

}
/*
[문제]
x의 y승을 처리

[실행결과]
x 입력 : 2
y 입력 : 10   input 

2의 10 승은  output
*/