package ch04;

import java.util.Arrays;

public class Arr14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {0,1,2,3,4};
		int []b = Arrays.copyOf(a, a.length);//배열 a의 길이까지
		int []c = Arrays.copyOf(a, 3);//a 를 0부터 3개
		int []d = Arrays.copyOf(a, 7);
		int []e = Arrays.copyOfRange(a, 2, 4);
		int []f = Arrays.copyOfRange(a, 0, 8);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
		
//Arrays.sort(); 배열()을 오름차순으로 정렬
	}

}
