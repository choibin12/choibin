package salary.service;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalaryUpdate implements Salary {

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 이름을 입력하시오");
		String n = sc.next();
		int i=0;
		
		for(i = 0; i<list.size(); i++) {
			if(list.get(i).getName().equals(n)) {
				System.out.println("사원번호\t이름\t직급\t기본급\t수당\t세율\t월급");
				System.out.println(list.get(i));
				System.out.print("수정 할 직급 입력 : ");
				list.get(i).setRank(sc.next());
				System.out.print("수정 할 기본급 입력 : ");
				list.get(i).setPay(sc.nextInt());
				System.out.print("수정 할 수당 입력 : ");
				list.get(i).setBonus(sc.nextInt());
				list.get(i).calc();
				System.out.print("수정하였습니다");
				break;
			}
		}
		if(i==list.size())System.out.println("잘못된이름입니다");					
		}
	

}
