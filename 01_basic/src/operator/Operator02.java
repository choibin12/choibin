package operator;

import java.util.Scanner;

//조건연산자 처리 
public class Operator02 {

	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오 : ");
		score = sc.nextInt();
		
		String result = score>=80 && score<=100 ? "합격" : "불합격" ;
		System.out.println(result);
//		System.out.println(score>=80 && score<=100 ? "합격" : "불합격" );
	}

}
