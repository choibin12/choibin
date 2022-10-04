package salary.main;

import salary.service.SalaryService;

public class SalaryMain {

	public static void main(String[] args) {
		SalaryService s = new SalaryService();
		s.menu();
		System.out.println("종료");
	}

}
