package class2;

import java.util.Scanner;

public class StringBufferMain {
	private int dan;
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.print("원하는 단을 입력 : ");
		dan = sc.nextInt();
	}
	void output() {
		StringBuffer buffer = new StringBuffer();
		for(int i=1; i<=9; i++) {
//			System.out.println(dan+"*"+i+"="+dan*i);
			
			
			buffer.append(dan);
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			
			System.out.println(buffer.toString());//StringBuffer -> String으로 변환해서 출력
			buffer.delete(0, buffer.length());
		}
	}
	public static void main(String[] args) {
		StringBufferMain BM = new StringBufferMain();
		BM.input();
		BM.output();

	}

}
