package for_;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x,y; int result=1;
		System.out.println("숫자를 두개 입력하시오");
		x= sc.nextInt();
		y= sc.nextInt();
		for(int i=1; i<=y; i++) {//2의 5승 xx
			result *=x;
			
		}
		//(2*2*2*2*2)
		System.out.print(x+"의"+y+"승은 :"+result+"입니다. (");
		
		for(int j=1; j<y; j++) {
			System.out.print(x+"*");
		}
		System.out.print(x+")");
	}
}
/*
2의 5승 xx (2*2*2*2*2)
값두개 받아서 
*/