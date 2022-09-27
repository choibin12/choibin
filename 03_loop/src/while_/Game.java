package while_;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int answer;
		
		while(true) {
			int i=1;
			int computer = r.nextInt(100)+1;

			System.out.println(computer);
			System.out.println("1~100까지의 숫자를 맞추시오");
			
			while(true) {
				System.out.println("숫자를 입력하시오");
				answer = sc.nextInt();
				if(answer>computer) {
					System.out.println(answer+"보다 작은 숫자 입니다");
					i++;
				}
				else if(answer<computer) {
					System.out.println(answer+"보다 큰 숫자 입니다");
					i++;
				}
				else if(answer==computer) {
					System.out.println("정답입니다");
					System.out.println(i+"번만에 맞췃습니다");
					break;
				}
			}
			System.out.println("더 하시겟습니까 ? Y/N");
			String yn = sc.next();
			if(yn.equals("N")||yn.equals("n")) {
				System.out.println("끝");
				break;
			}
		}


	}

}
/*
 [문제] 숫자 맞추기 게임
- 컴퓨터가 1 ~ 100사이의 난수를 발생하면, 발생한 난수를 맞추는 게임
- 몇 번만에 맟주었는지 출력한다.

[실행결과]
1 ~ 100사이의 숫자를 맞추세요 (77)

숫자 입력 : 50
50보다 큰 숫자입니다
숫자 입력 : 80
80보다 작은 숫자입니다.
~
~
숫자 입력 : 77
딩동뎅...x번만에 맞추셨습니다.
*/