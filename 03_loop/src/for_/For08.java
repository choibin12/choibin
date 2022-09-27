package for_;

import java.util.Scanner;

public class For08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int sum2 = 0;

		while (true) {
			while (true) {
				System.out.println("숫자 입력 : ");
				int x = sc.nextInt();
				if (x == 0) {
					System.out.println("종료");
					break;
				} else if (x < 0) {
					System.out.println("다시입력하시오");
				}

				for (int i = 1; i <= x; i++) {
					if (x % i == 0)
						System.out.print(i + " ");
					if (x % i != 0)
						sum += i;// 약수를 제외한 수의 합
					sum2 += i;// 모든수의 합
				}
				System.out.println();
				if (sum2 - sum == x + 1) {
					System.out.println(x + "는 소수다");
					break;
				}
				// 모든수의합 -약수를 제외한 수의 합 = 자기자신과 1
				else {
					System.out.println(x + "는 소수가 아니다");
					break;
				}
			} // 변수에 약수 갯수 세기,갯수2개만 소수
		}
	}// while
}
/*
 * 문제] 약수와 소수(1과 자기자신의 숫자만 약수로 갖는 수)를 구하기 0이 입력되면 종료 음수가 입력되면 숫자를 다시입력 [실행결과] 숫자
 * 입력 : 12 1 2 3 4 6 12 12는 소수가 아니다
 * 
 * 숫자 입력 : 37 1 37 37는 소수이다
 */