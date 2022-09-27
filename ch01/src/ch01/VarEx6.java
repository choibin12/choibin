package ch01;
import java.util.Scanner;//import문 추가

public class VarEx6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);// Scanner 클래스 객체 생성
//      int num = sc.nextInt();
//		int num2 = sc.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		System.out.println(num);
		
				

	}

}
