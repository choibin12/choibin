package sungjuk;

import java.util.ArrayList;
import java.util.Scanner;


public class SungJukService{
	
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
	void menu() {
		Scanner sc = new Scanner(System.in);
		int num;
		SungJuk sungJuk = null;
		while(true) {
			System.out.println("*************\r\n"
					+ "수행 할 번호를 입력하시오\r\n"
					+ "   1. 입력\r\n"
					+ "   2. 출력\r\n"
					+ "   3. 수정\r\n"
					+ "   4. 삭제\r\n"
					+ "   5. 정렬\r\n"
					+ "   6. 끝내기\r\n"
					+ "*************");
			System.out.print("번호입력 : ");
			num = sc.nextInt();
			if(num == 1) {
				sungJuk = new SungJukInsert();
			}
			else if(num == 2) {
				sungJuk = new SungJukList();
			}
			else if(num == 3) {
				sungJuk = new SungUpdate();
			}
			else if(num == 4) {
				sungJuk = new SungJukDelete();
			}
			else if(num == 5) {
				sungJuk = new SungJukSort();
			}
			else if(num == 6) {
				break;
			}
			else {
				System.out.println("잘못입력하셧습니다 1~5까지의 숫자를 입력하시오");
				continue;
			}
			sungJuk.execute(list);
		}
	}
}
