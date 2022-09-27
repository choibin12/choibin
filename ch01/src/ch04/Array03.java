package ch04;

public class Array03 {

	public static void main(String[] args) {
				int sum = 0;
				double average = 0;
				int[] score = {100,88,100,100,90};
				for(int i=0; i<score.length; i++){
				sum += score[i];
				
	}
			average = sum/(double)score.length;
			System.out.println(sum);
			System.out.println(String.format("%.1f",average));

	}
}
