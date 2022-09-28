package interface_;

import java.util.Scanner;

public class ComputeService {
	int num;
	Scanner sc = new Scanner(System.in);
	void menu() {
		while(true) {
			Compute com = null;
			System.out.println("*************\r\n"
					+ "수행 할 번호를 입력하시오\r\n"
					+ "   1. 더하기\r\n"
					+ "   2. 빼기\r\n"
					+ "   3. 곱하기\r\n"
					+ "   4. 나누기\r\n"
					+ "   5. 끝내기\r\n"
					+ "*************");
			System.out.print("번호입력 : ");
			num = sc.nextInt();
			if(num == 1) {
				com = new Sum();//다형성 
				
			}
			else if(num == 2) {
				com = new Sub();
			}
			else if(num == 3) {
				com = new Mul();
				
			}
			else if(num == 4) {
				com = new Div();
			}
			else if(num == 5) {
				break;
			}
			else {
				System.out.println("잘못입력하셧습니다 1~5까지의 숫자를 입력하시오");
			}
			com.setData();
			com.calc();
			com.disp();
		}
	}
	
}
