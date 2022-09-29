package sungjuk;

import java.util.Scanner;


public class SungJukDTO implements Comparable<SungJukDTO> {
	private  int number,tot,kor,eng,math;
	private double avg;
	private String name;
	Scanner sc = new Scanner(System.in);
	public String toString() {
		return number+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.2f", avg);
	}
	public SungJukDTO(int number , String name , int kor,int eng,int math) {
		this.number = number;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math =  math;
		
	}
	
	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	int getNumber() {
		return number;
	}
	
	void calc() {
		setTot(getEng()+getMath()+getKor());
		setAvg(getTot()/3.0);
	}
	@Override
	public int compareTo(SungJukDTO o) {
		if(this.tot<o.tot) return -1;
		else if(this.tot > o.tot) return 1;
		else return 0;
		
	}
}
/*
1. SungJukDTO.java
필드 : 번호(중복X), 이름, 국어, 영어, 수학, 총점, 평균
메소드 : 생성자
       setter / getter
       1.총점으로 내림차순
       2.이름으로 오름차순
*/