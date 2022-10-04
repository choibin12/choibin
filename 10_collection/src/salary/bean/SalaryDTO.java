package salary.bean;

import java.util.Scanner;



public class SalaryDTO implements Comparable<SalaryDTO>{
	private  int number,pay,bonus,taxper,sum,salary;
	private String name,rank;
	public String toString() {
		return number+"\t"+name+"\t"+rank+"\t"+pay+"\t"+bonus+"\t"+taxper+"%"+"\t"+salary;
	}
	public SalaryDTO(int number,String name, String rank, int pay, int bonus) {
		super();
		this.number = number;
		this.name = name;
		this.rank = rank;
		this.pay = pay;
		this.bonus = bonus;
	}
	Scanner sc = new Scanner(System.in);
	public int getNumber() {
		return number;
	}
	public int getTaxper() {
		return taxper;
	}
	public void setTaxper(int taxper) {
		this.taxper = taxper;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public void calc() {
		setSum(getPay()+getBonus());
		int taxper;
		if(getSum()>4000000) {
			taxper=3;
		}else if(getSum()>2000000&&getSum()<=4000000) {
			taxper = 2;
		}else taxper = 1;
		setTaxper(taxper);
		salary = getSum()-(sum*getTaxper()/100);
		setSalary(salary);
	}
	@Override
	public int compareTo(SalaryDTO o) {
		return this.getName().compareTo(o.getName());
		
		
	}
}
