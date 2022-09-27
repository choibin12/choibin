package if_;

import java.util.Scanner;

public class If021 {

	public static void main(String[] args) {
		int a, b, c, sum;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sum = a+b+c;
		System.out.println("a의 값 : "+a);
		System.out.println("b의 값 : "+b);
		System.out.println("c의 값 : "+c);
		if(sum/3>=60) {
			if(a>=40&&b>=40&&c>=40) System.out.println("합격");
			else System.out.println("과락");
			
		}else System.out.println("불합격");
	}

}
