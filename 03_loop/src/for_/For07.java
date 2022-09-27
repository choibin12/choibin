package for_;

import java.util.Scanner;

public class For07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y = 1;
		for(int i=1; i<=x; i++) {
			y *= i;
			
		}
		
		System.out.print(x+"! ="+y);
		for(int i=1; i<=x; i++) {
			if(i==1) System.out.print("(1");
			if(i<x) System.out.print("*"+(i+1));
			if(i==x)System.out.print(")");
		}
	}

}
/*
  [문제] 팩토리얼을 구하시오 (for)
- 입력되는 숫자는 1 ~ 10 사이만 입력한다.

[실행결과]
숫자 입력 : 3
3! = 6 (1*2*3)
-------------------------
숫자 입력 : 9
9! = 362880 (1*2*3*...*9)*/
