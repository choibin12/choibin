package array;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int []ar = new int[3];
		int [] ar1 = new int[3];
		String start;
		while(true) {
			System.out.print("게임을 실행하시겠습니까(Y/N) " );
			start =sc.next();
			if(start.equals("Y")||start.equals("y")) {
				System.out.println("시작");
			}else if(start.equals("N")||start.equals("n")) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("잘못입력하였습니다");
				continue;
			}
			for(int i = 0; i<ar.length; i++) {
				ar[i] = r.nextInt(9)+1;
				for(int j = 0; j<i; j++) {
					if(ar[i] == ar[j]) {
						i--;
						break;
					}
				}
			}
			while(true) {
				System.out.print("숫자 입력 : ");
//				int a = sc.nextInt();
//				ar1[0] = a/100;
//				ar1[1] = a%100/10;
//				ar1[2] = a%100%10/1;
				String a =sc.next();
				for(int i=0; i<ar1.length; i++) {
					ar1[i]=a.charAt(i)-48;
				}
				int strike = 0;
				int ball = 0;
//				for(int i=0; i<ar.length; i++) {
//					if(ar[i]==ar1[i]) {
//						strike++;
//					}
//				}
				for(int i = 0; i<ar.length; i++) {
					for (int j = 0; j<ar1.length; j++) {
						if(ar[i]==ar1[j]) {
							if(i==j) strike++;
							else	ball++;
						}
					}
				}
				System.out.println(strike+"스트라이크 "+ball+"볼");
				if(strike==3) break;
			}
			break;
		}
	}	
}
/*
야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
발생한 수를 맞추는 게임
중복은 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123
0스트라이크 0볼

숫자입력 : 567
0스트라이크 2볼

숫자입력 : 758
1스트라이크 2볼
...

숫자입력 : 785
3스트라이크 0볼
*/