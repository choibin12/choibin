package sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukInsert  implements SungJuk{
	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		int number = sc.nextInt();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("귝어 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 입력 : ");
		int math = sc.nextInt();
		System.out.println("입력되었습니다");
		SungJukDTO sunjuckDTO = new SungJukDTO(number,name,kor,eng,math);
		sunjuckDTO.calc();
		list.add(sunjuckDTO);
	}
}
/*2. SungJukInsert.java
- 번호, 이름, 국어, 영어, 수학를 입력하여 총점과 평균을 계산한다.

번호 입력 : 
이름 입력 : 
국어 입력 : 
영어 입력 : 
수학 입력 : 

입력되었습니다
*/
