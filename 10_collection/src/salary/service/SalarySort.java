package salary.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalarySort implements Salary,Comparable<SalaryDTO>{

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.이름으로 오름차순\r\n"
					+ "2.월급으로 내림차순\r\n"
					+ "3.이전메뉴");
			System.out.print("번호 입력 : ");
			int num = sc.nextInt();
			if(num==1) {
				Collections.sort(list);
				System.out.println("정렬 후");
				for(SalaryDTO data : list) {
					System.out.println(data);
				}
				break;
			}
			else if(num==2) {
				Collections.sort(list, com);
				System.out.println("정렬 후");
				for(SalaryDTO data : list) {
					System.out.println(data);
				}
				break;

			}
			else if(num==3) {
				break;
			}else System.out.println("잘못 입력하셧습니다 다시 입력하십시오");

		}
	}

	@Override
	public int compareTo(SalaryDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	Comparator<SalaryDTO> com = new  Comparator<SalaryDTO>() {
		
		@Override
		public int compare(SalaryDTO o1, SalaryDTO o2) {
			return o1.getSalary()<o2.getSalary() ? 1:-1 ;
		}
	};
	

}
