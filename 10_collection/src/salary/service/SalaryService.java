package salary.service;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean.SalaryDTO;


public class SalaryService {
	private ArrayList<SalaryDTO> list = new ArrayList<SalaryDTO>();
	public void menu() {
		Scanner sc = new Scanner(System.in);
		int num;
		Salary salary = null;
		while(true) {
			System.out.println("*************\r\n"
					+ "수행 할 번호를 입력하시오\r\n"
					+ "   1. 등록\r\n"
					+ "   2. 출력\r\n"
					+ "   3. 수정\r\n"
					+ "   4. 검색\r\n"
					+ "   5. 삭제\r\n"
					+ "   6. 정렬\r\n"
					+ "   7. 끝내기\r\n"
					+ "*************");
			System.out.print("번호입력 : ");
			num = sc.nextInt();
			if(num == 1) {
				salary = new SalaryWrite();
			}
			else if(num == 2) {
				salary = new SalaryPrint();
			}
			else if(num == 3) {
				salary = new SalaryUpdate();
			}
			else if(num == 4) {
				salary = new SalarySearch();
			}
			else if(num == 5) {
				salary = new SalaryDelete();
			}
			else if(num == 6) {
				salary = new SalarySort();
			}
			else if(num == 7) {
				break; //System.exit(0);강제종료
			}
			else {
				System.out.println("잘못입력하셧습니다 1~6까지의 숫자를 입력하시오");
				continue;
			}
			salary.execute(list);
		}
	}
}
