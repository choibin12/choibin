package ch04;

import java.util.Arrays;

public class Array06 {

	public static void main(String[] args) {
		int [] lot = new int[6];
		for(int i=0; i<lot.length; i++) {
			lot[i] = (int)(Math.random()*45+1);
		}
		System.out.println("이번주 로또 번호는 : "+Arrays.toString(lot)+"입니다.");
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		for(int i = 0; i<100; i++) {
			int n = (int)(Math.random()*10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
	}
}
