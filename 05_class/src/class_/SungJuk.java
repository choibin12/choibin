package class_;

import java.util.Scanner;

public class SungJuk {
	private	String name;
	private	int kor,eng,math;
	private	char grade;
	private	int tot;
	private	double avg;
	public void setData(String a,int b, int c, int d) {
		name = a;
		kor = b;
		eng = c;
		math = d;
	}
	String getName() {
		return name;
	}
	int getKor() {
		return kor;
	}
	int getEng() {
		return eng;
	}
	int getMath() {
		return math;
	}
	int getTot() {
		return tot;
	}
	double getAvg() {
		return avg;
	}
	char getGrade() {
		return grade;
	}
	void calc(){
		tot = kor+eng+math;
		
		avg = tot/3.0;
		
		if(avg>=90) {
			grade = 'A';
		}
		else if(avg>=80&&avg<90) {
			grade = 'B';
		}
		else if(avg>=70&&avg<80) {
			grade = 'C';
		}
		else {
			grade = 'F';
		}
	
	}
	void print() {
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.2f", avg)+"\t"+grade);
	}
}
/*
[문제] 성적처리
클래스명 : SungJuk
필드 : name, kor, eng, math, tot, avg, grade
메소드 : setData(이름, 국어, 영어, 수학)
       calc() - 총점, 평균, 학점 계산
      getName()
      getKor()
      getEng()
      getMath()
       getTot()
       getAvg()
       getGrade()

클래스명 : SungJukMain

[실행결과]
----------------------------------------------------
이름      국어      영어      수학      총점      평균      학점
----------------------------------------------------
홍길동   90      95      100

 */