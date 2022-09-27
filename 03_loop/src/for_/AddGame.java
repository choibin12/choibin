package for_;

import java.util.Random;
import java.util.Scanner;

public class AddGame {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int a, b, ans;
		int score = 0;
		while (true) {
			for (int i = 1; i <= 5; i++) {
				int j = 0;
				a = r.nextInt(90) + 10;//10~99
				b = r.nextInt(90) + 10;
				System.out.print("[" + i + "]" + a + "+" + b + "= ");
				while (j < 2) {
					ans = sc.nextInt();
					if (ans == a + b) {

						System.out.println("정답");
						score ++;
						break;
					} else {
						System.out.println("틀렷습니다 다시 ");
						j++;
						if (j == 2) {
							System.out.println("정답은" + (a + b));
							break;
						}
					}
				}

			}
			System.out.println("당신은 총"+score+"문제를 맞추어서 점수 "+score*20+"점입니다.");//당신은 총 x 문제를 맞추어서 점수 xx점 입니다.
			System.out.println("또 할래(Y/N)");
			
			String yn = sc.next();
			if (yn.equals("N") || yn.equals("n")) {
				System.out.println("끝");
				break;
			} else if (yn.equals("Y") || yn.equals("y")) {
				System.out.println("재시작");
				System.out.println();
			}
		  
		}
	}
}
/*
 * [문제] 덧셈 계산 (for, while, 다중 for) - 10 ~ 99 사이의 난수를 2개 발생하여 합을 구하는 프로그램 - 5문제를
 * 제공한다. - 1문제당 점수 20점씩 처리한다.o - 틀리면 1번 더 기회를 주고,o 2번 다 틀리면 답을 알려준다.o
 * 
 * [실행결과] [1] 25 + 36 = 50 틀렸다 [1] 25 + 36 = 59 틀렸다 정답은 xx
 * 
 * [2] 10 + 25 = 35 딩동뎅
 * 
 * [5] 78 + 95 = 89 틀렸다 [5] 78 + 95 = 173 딩동뎅
 * 
 * 당신은 총 x 문제를 맞추어서 점수 xx점 입니다.
 * 
 * 또 할래(Y/N) : 프로그램을 종료합니다.
 */