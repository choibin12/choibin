package ch04;

import java.util.Arrays;

public class Arr11 {

	public static void main(String[] args) {
		int[][]score = new int[4][3];
		int sum=0;
			for(int i=0; i<score.length; i++) {
				
					for (int j = 0; j<score[i].length; j++) {
					score[i][j] = (int)(Math.random()*10+1);
					System.out.printf("score[%d][%d]=%d\n",i,j,score[i][j]);
					sum += score[i][j];
				}
			}
			System.out.println("sum = "+sum);
			
	}

}
