package salary.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalaryDelete implements Salary{

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제 할 사원 번호를 입력");
		int number = sc.nextInt();
		Iterator<SalaryDTO>iterator = list.iterator(); 
		int sw = 0;
		while(iterator.hasNext()) {
			if(iterator.next().getNumber()==number) {
				iterator.remove();//.remove()는 반드시 .next()가 반환하는 데이터 항목을 삭제
				sw++;
			}

		}
		if(sw==0) {
			System.out.println("삭제 할 번호가 없습니다");
		}else {
			System.out.println(number+"번 사원 삭제완료");
		}
	}

}
