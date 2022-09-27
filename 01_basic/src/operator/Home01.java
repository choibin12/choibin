package operator;

import java.util.Random;

public class Home01 {

	public static void main(String[] args) {
		Random r = new Random();
		Random r1 = new Random();
		int d = r.nextInt(6)+1;
		int d1 = r1.nextInt(6)+1;
		System.out.println("주사위 1 :"+d+"\t"+"주사위 2 : "+d1);
		String result = d>d1 ? "주사위 1이 "+d+"으로 승"  : d<d1 ? "주사위 2가 "+d1+"으로 승":"주사위1과 주사위2가 같다" ;
		int sum = d+d1;
		System.out.println(result);
		System.out.println("주사위 합 "+sum);
		
		
	}

}
/*[문제] 주사위 게임 - 난수
2개의 주사위를 던져서 큰값을 가진 주사위가 승이다.
주사위 값의 합도 출력하시오

[실행결과]
주사위1 : 3   주사위2 : 1
주사위1 이 3으로 승
합 = 4
-----------------------------
주사위1 : 4   주사위2 : 6
주사위2 이 6으로 승
합 = 10
-----------------------------
주사위1 : 3   주사위2 :3
주사위1과 주사위2가 같다
합 = 6
*/