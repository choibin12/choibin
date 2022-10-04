package salary.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalaryWrite implements Salary{


	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		Scanner sc = new Scanner(System.in);
		Iterator<SalaryDTO>iterator = list.iterator(); 
		
		System.out.print("사원 번호 입력 : ");
		int number = sc.nextInt();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("직급 입력 : ");
		String rank = sc.next();
		System.out.print("기본급 입력 : ");
		int pay = sc.nextInt();
		System.out.print("수당 입력 : ");
		int bonus = sc.nextInt();
		System.out.println("입력되었습니다");
		SalaryDTO salaryDTO = new SalaryDTO(number, name, rank, pay, bonus);
		salaryDTO.calc();
		list.add(salaryDTO);
	}

}
