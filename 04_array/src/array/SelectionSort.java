package array;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = {35,48,25,72,50};
		System.out.print("정렬 전 : ");
		for(int data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		for(int i = 0; i<ar.length-1; i++) {//배열 마지막값은 비교할 필요가 없음 i<ar.length-1;
			for(int j = i+1; j<ar.length; j++) {//ar[i]와 ar[i+1] ~ ar[ar.length]까지의 값을 비교
				int tmp;
				if(ar[i]>ar[j]) {// i가 j보다 크면 i->tmp j->i tmp->j순으로 저장 
					tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}
			}
		}
		System.out.print("정렬 후 : ");
		for(int data : ar) {
			System.out.print(data+" ");
		}
	}

}
