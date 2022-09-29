package sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungUpdate implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
			Scanner sc = new Scanner(System.in);
			System.out.print("찾을 번호를 입력하시오");
			int num = sc.nextInt();
			int i=0;
			
			for(i = 0; i<list.size(); i++) {
				if(list.get(i).getNumber()==num) {
					System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
					System.out.println(list.get(i));
					System.out.print("수정 할 이름 입력 : ");
					list.get(i).setName(sc.next());
					System.out.print("수정 할 귝어 입력 : ");
					list.get(i).setKor(sc.nextInt());
					System.out.print("수정 할 영어 입력 : ");
					list.get(i).setEng(sc.nextInt());
					System.out.print("수정 할 수학 입력 : ");
					list.get(i).setMath(sc.nextInt());
					list.get(i).calc();
					System.out.print("수정하였습니다");
					break;
				}
			}
			if(i==list.size())System.out.println("잘못된번호입니다");					
			}
			
		
		
	}



/*
4. SungJukUpdate.java
- 없는 번호가 입력되면 "잘못된 번호 입니다." 라고 출력한다.
- 있는 번호가 입력되면 번호에 해당하는 데이틀 출력 후 수정한다.
번호 입력 : 
잘못된 번호 입니다.

또는 

번호   이름   국어   영어   수학    총점   평균

수정 할 이름 입력 : 
수정 할 국어 입력 : 
수정 할 영어 입력 : 
수정 할 수학 입력 : 

수정하였습니다.

*/