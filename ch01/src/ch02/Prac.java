package ch02;

import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int own; int com = (int)(Math.random()*3+1);
		System.out.print("가위 = 1, 바위= 2 보= 3 일때 숫자를 입력하십시오 : ");
		own = sc.nextInt();
		if(own>3||own<1) System.out.println("잘못입력하셧습니다");
		
		String a = " "; String b = " ";
		
		if(own==1)
			a ="가위";
		if(own==2)
			a="바위";
		if(own==3)
			a="보";
		if(com==1)
			b="가위";
		if(com==2)
			b="바위";
		if(com==3)
			b="보";
		
		System.out.println("나 :"+a+"\t컴퓨터 : "+b);
		
		if(own==1) {
			if(com==1) 
				System.out.println("비겻습니다");
			if(com==2) 
				System.out.println("졋습니다");
			if(com==3) 
				System.out.println("이겼습니다");
			
			
		}
		if(own==2) {
			if(com==1)
				System.out.println("이겼습니다");
			if(com==2)
				System.out.println("비겻습니다");
			if(com==3)
				System.out.println("졌습니다");
		}
		if(own==3) {
			if(com==1)
				System.out.println("졋습니다");
			if(com==2)
				System.out.println("이겻습니다");
			if(com==3)
				System.out.println("비겻습니다");	
		}
		
	}

}
