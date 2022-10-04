package sungjuk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class SungJukSort  implements SungJuk ,Comparable<SungJukDTO>{
	Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
		
		@Override
		public int compare(SungJukDTO o1, SungJukDTO o2) {
			return o1.getName().compareTo(o2.getName()); //-1 1 0
		}
	};
	Comparator<SungJukDTO> com2 = new Comparator<SungJukDTO>() {
		
		@Override
		public int compare(SungJukDTO o1, SungJukDTO o2) {
			return o1.getNumber()>o2.getNumber() ? 1:-1 ;//오름차순
//			return o1.getNumber()>o2.getNumber() ? -1:1 ;//내림차순
//			return o1.getNumber()<o2.getNumber() ? 1:-1 ;//내림차순
		}
	};

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.총점으로 내림차순\r\n"
					+ "2.이름으로 오름차순\r\n"
					+ "3.번호순으로 오름차순\r\n"
					+ "4.이전메뉴");
			System.out.print("번호 입력 : ");
			int num = sc.nextInt();
			if(num==1) {
				Collections.sort(list);
				System.out.println("정렬 후");
				for(SungJukDTO data : list) {
					System.out.println(data);
				}
				break;
			}
			else if(num==2) {
				Collections.sort(list, com);
				System.out.println("정렬 후");
				for(SungJukDTO data : list) {
					System.out.println(data);
				}
				break;

			}
			else if(num==3) {
				Collections.sort(list, com2);
				System.out.println("정렬 후");
				for(SungJukDTO data : list) {
					System.out.println(data);
				}
				break;

			}
			else if(num==4) {
				break;
			}else System.out.println("잘못 입력하셧습니다 다시 입력하십시오");

		}
	}
	@Override
	public int compareTo(SungJukDTO o) {
		
		return 0;
	}



}
/*
1.총점으로 내림차순
2.이름으로 오름차순
3.이전메뉴
 번호 : 1
*/