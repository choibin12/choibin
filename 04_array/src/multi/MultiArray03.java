package multi;

public class MultiArray03 {

	public static void main(String[] args) {
		String [] name = {"홍길동","프로도","죠르디"};
		int [][]score = {{90,95,100,0},{100,89,75,0},{75,80,48,0}};
		double[]avg = new double[3];
		char[]grade = new char[3];
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length-1; j++) {
				score[i][score[i].length-1] +=score[i][j];
			}
		}
		for(int i=0; i<score.length; i++) {
			avg[i] = (double)score[i][3]/3;
		}
		for(int i=0; i< avg.length; i++) {
			if(avg[i]>=90) {
				grade[i] ='A';
			}else if(avg[i]>=80&&avg[i]<90) {
				grade[i] ='B';
			}else if(avg[i]>=70&&avg[i]<80) {
				grade[i] ='C';
			}else {
				grade[i] ='F';
			}
		}
		System.out.println("----------------------------------------------------\r\n"
				+ "이름\t국어\t영어\t수학\t총점\t평균\t학점\r\n"
				+ "----------------------------------------------------");
		for(int i = 0; i<name.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j = 0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print((String.format("%.2f", avg[i]))+"\t"+grade[i]);
			System.out.println();
		}
	}
}
/*
----------------------------------------------------
이름      국어      영어      수학      총점      평균      학점
----------------------------------------------------
홍길동   90      95      100
코난      100      89      75
또치      75      80      48
----------------------------------------------------
*/
