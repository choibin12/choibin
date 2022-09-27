package array;

import java.util.Random;

public class Array05 {

	public static void main(String[] args) {
		char []ar = new char [50]; //문자 저장
		Random r = new Random();
		int []ar2 = new int[26];//문자 갯수 저장
		for(int i=0; i<ar.length; i++) {
			ar[i] = (char)(r.nextInt(26)+65);//랜덤 A~Z 배열0~49까지 입력
			System.out.print(ar[i]+" ");
			if((i+1)%10==0)System.out.println();
		}
		System.out.println();
		for(int i=0; i<ar2.length; i++) {//ar2 0~25까지
			for(int j=0; j<ar.length; j++) {//ar2에 ar에있는 문자 갯수 저장
				if(ar[j]==(char)(i+65)) ar2[i]++;
			}
			System.out.println(((char)(65+i))+":"+ar2[i]);
		}

	}
}
/*[문제] 크기가 50개인 문자배열을 잡아서 65~90사이의 난수를 발생하여 저장 후 출력하시오
- 1줄에 10개씩 출력
- A의 개수? B의 개수? C의 개수? ~~~ Z의 개수 ?

[실행결과]
D F A G H I J K L T
O P W E R F V A S B
P Y R O L E E Z L I
F E U Z T U P P P A
S P G B F F O W J C

A : 2
B : 3
...
X : 0
Y : 1
Z : 0
 */
