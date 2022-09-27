package operator;

import java.util.Scanner;

public class Home021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("알파벳 하나를 입력하세요");
		Scanner input = new Scanner(System.in);

		char ch = input.next().charAt(0); // 맨 앞글자반환해주는 함수

		System.out.println(ch);

		if (ch >= 'A' && ch <= 'Z') { // 대문자일 때
			System.out.println((char) (ch + ('a' - 'A')));
		} else if (ch >= 'a' && ch <= 'z') { // 소문자일 때
			System.out.println((char) (ch - ('a' - 'A')));
		} else {
			System.out.println("잘못입력하였습니다.");

	}

}
}