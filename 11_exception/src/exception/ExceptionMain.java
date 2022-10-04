package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		if(args.length>0) System.out.println("args[0] = "+args[0]);
		System.out.println();
		try {
		int num2 = Integer.parseInt(args[0]);
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int num = sc.nextInt();
		System.out.println(num2+"/"+num+"="+(num2/num));
		}catch (NumberFormatException e) {
			System.out.println("숫자 형식으로 넣으시오");
			e.printStackTrace();
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
			// TODO: handle exception
		}catch (InputMismatchException e) {
			System.out.println("숫자형식을 넣으시오");
			// TODO: handle exception
		}finally {
			System.out.println("error가 있건 없건 무조건 실행");
		}
	}

}
