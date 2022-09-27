package ch02;
import java.util.Scanner;
public class If1 {

	public static void main(String[] args) {
		int score;
		char grade =' ', opt = '0';
		System.out.print("점수를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		System.out.println("당신의 점수는 "+score+"점 입니다.");
		if(score>=90) {
			grade = 'A';
			if (score>98) {
				opt = '+';
			} else if (score<94) {
				opt = '-';
			}
		}	else if (score>=80) {
			grade = 'B';
			if (score>88) {
				opt = '+';
			} else if (score<84) {
				opt = '-';
			}
		}	else if (score>=70) {
			grade = 'C';
			if (score>78) {
				opt = '+';
			}else if(score<74) {
				opt = '-';
			}
		}	else {
			grade = 'D';
		}
		System.out.println("당신의 학점은 "+grade+opt+"입니다.");
			
		

	}

}
