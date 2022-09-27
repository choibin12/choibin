package if_;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("데이터 입력 : ");
		int a = sc.nextInt();
		if(a>50) System.out.println(a +"는 50보다 크거나 같다");
			else System.out.println(a+"는 50보다 작다");
		System.out.println();
		//a-c
		if(true)
			if(true) System.out.println("A");
			else System.out.println("B");
		System.out.println("C");
		System.out.println();
			//b-c
		if(true)
			if(false) System.out.println("A");
			else System.out.println("B");
		System.out.println("C");
		System.out.println();
		if(false)
			if(true) System.out.println("A");
			else System.out.println("B");
		System.out.println("C");
		System.out.println();
		
		if(a>='A'&& a<='Z')//65~90
			System.out.println((char)a+"는 대문자");
		else if(a>='a'&&a<='z')//97 ~ 122
			System.out.println((char)a+"는 소문자");
		else
			System.out.println((char)a+"는 특문이거나 숫자");
	}

}
