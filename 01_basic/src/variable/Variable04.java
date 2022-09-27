package variable;

import java.util.Random;

public class Variable04 {

	public static void main(String[] args) {
		int a = 10; //지역변수 초기화필요
		System.out.println("지역변수 a ="+a); //변수값
		System.out.println();
		Random r = new Random(); //객체 생성 
		System.out.println("객체 r = "+r); // 주소값
		System.out.println(r.nextDouble());
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(100));//0~99
		System.out.println(r.nextInt(26)+65);//65~90
		System.out.println();
		String b = new String("사과");
		String c = "딸기"; // 문자열 literal 생성
		System.out.println(b+"\t"+c);
		
	}

}
