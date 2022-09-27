package if_;

import java.util.Scanner;

public class If031 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println("a의 값 : "+a);
		System.out.println("b의 값 : "+b);
		System.out.println("c의 값 : "+c);
		if(a<=b&&a<=c) {//a가 제일 작을때
			if(b<=c) System.out.println(a+","+b+","+c);//b가 c보다 작을때
			else System.out.println(a+","+c+","+b);
		}else if(b<=c) {//b가 제일 작을때
			if(a<=c) System.out.println(b+","+a+","+c);
			else System.out.println(b+","+c+","+a);
		}else {//c가 제일 작을때
			if(a<=b) System.out.println(c+","+a+","+b);
			else System.out.println(c+","+b+","+a);
		}
	}

}
