package for_;

import java.util.Random;

public class For04 {

	public static void main(String[] args) {
		Random r = new Random();
		int sumA = 0;
		for(int i=1; i<=100; i++) {//100번 반복
			char ch = (char)(r.nextInt(26)+65);//A~Z까지 코드값랜덤생성
			System.out.print(ch);
//			if(ch==65) sumA++;	//ASCII
			if(ch=='A')sumA++;
			if(i%10==0) System.out.println();//10개마다 줄바꿈
			
		}
		
		System.out.println("A의 갯수 : "+sumA);
	}

}
