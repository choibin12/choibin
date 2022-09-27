package multi;

import java.util.Scanner;

public class MultiArray05 {
//인원수입력 > (이름 > 과목수 > 과목 명 > 점수)인원수만큼 반복 > 인원수만큼 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 입력");
		int cnt = sc.nextInt();
		String [] name = new String[cnt];
		String[][] subject = new String[cnt][];
		int jumsu[][] = new int [cnt][];
		int sum;
		double avg [] = new double [cnt];
			for(int i=0; i<cnt; i++) {//인원수만큼 반복
				System.out.print("\n이름 입력 : ");
				name[i] = sc.next();
				int subjectcnt;
				System.out.print("\n과목 수 입력 : ");
				subjectcnt=sc.nextInt();
				subject[i]= new String[subjectcnt];//subject [i]의 길이 [subjectcnt]
				for(int j = 0; j<subjectcnt; j++) {
					System.out.print("\n과목이름입력 : ");
					subject[i][j] = sc.next();
					}
				jumsu[i] = new int[subjectcnt+1];//jumsu[i] 의길이 subjectcnt+1 = 과목수 + 총점
				for (int j = 0; j<subjectcnt; j++) {
					System.out.print(subject[i][j]+" 점수 입력 :");
					jumsu[i][j] = sc.nextInt();
					}
				sum =0;
				for(int j=0; j<jumsu[i].length; j++) {
					sum+=jumsu[i][j];
					}
				jumsu[i][subjectcnt]=sum;
				avg[i] = (double)sum/subjectcnt;
			}
			for(int i=0; i<cnt; i++) {// 출력
				for(int j=0; j<subject[i].length; j++) { //이름     국어     영어   총점     평균 출력
					if(j==0)System.out.print("이름");
					System.out.print("\t"+subject[i][j]);
					if(j==subject[i].length-1) System.out.print("\t총점\t평균");
					}
				System.out.println(); 
				for(int j=0; j<jumsu[i].length; j++) {//홍길동    95     100   xxx     xx.xx 출력
					if(j==0)System.out.print(name[i]);
					System.out.print("\t"+jumsu[i][j]);
					if(j==jumsu[i].length-1)System.out.print("\t"+String.format("%.2f", avg[i]));//총점 출력후 for문 끝나기전에 
					}//총점 출력후 for문 끝나기전에 평균 출력
				System.out.println();
				System.out.println();//전체 출력하고 줄 띄우기
			}

	}

}
/*
인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

[실행결과]
인원수 : 2 (cnt)

이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------

이름     국어     영어   총점     평균
홍길동    95     100   xxx     xx.xx

이름   국어  영어   과학    총점      평균
이기자   95   100      90        xxx      xx.xx
*/