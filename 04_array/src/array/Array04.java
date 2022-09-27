package array;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] ar =  new boolean [5];

		while(true) {
			System.out.println();
			System.out.println("**************");
			System.out.println("1.입차");
			System.out.println("2.출차");
			System.out.println("3.리스트");
			System.out.println("4.종료");
			System.out.println("**************");
			System.out.print("메뉴 : ");

			int input = sc.nextInt();
			if(input==1) {
				System.out.println("위치를 고르십시오");
				int a = sc.nextInt();
				if(ar[a-1]) {				
					System.out.println("이미 주차되어 있습니다");
				}
				else  {
					ar[a-1] = true;
					System.out.println(a+"번 위치에 입차");
				}
			}
			if(input==2) {
				System.out.println("위치를 고르십시오");
				int a = sc.nextInt();
				if(ar[a-1]) {				
					ar[a-1] = false;
					System.out.println(a+"번 위치에서 출차");
				}
				else  {
					System.out.println("주차되어있지 않습니다");
				}
			}
				if(input==3) {
					for(int i=0; i<ar.length; i++) {
						System.out.println((i+1)+"번 위치 :"+ar[i]);
					}
				}
				if(input==4) { 
					System.out.println("종료");				
					break;
				}
				if(input<1||input>4) {
					System.out.println("1~4번 까지만 입력하시오");
					continue;
				}
			}
		
	}
}
/* ar 5   0,1 //if(boolean x == true false) x// if(x) A; > true일때        else B; > false일때
주차장 관리 프로그램
**************
   1. 입차      
   2. 출차      
   3. 리스트   
   4. 종료
**************
  메뉴 : 

1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다

3번인 경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false
*/