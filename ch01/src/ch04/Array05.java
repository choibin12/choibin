package ch04;

public class Array05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {13,45,99,100,40,50};
		int max = score[0];
		int min = score[0];
		for (int i = 0; i<score.length; i++) {
			if(score[i]>max) {
				max = score[i];
			}
			else if(score[i]<min) {
				min = score[i];
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}

}
