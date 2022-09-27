package array;

import java.util.Arrays;
import java.util.Random;
//다중for문 중복숫자 없이 번호 만들기
public class Array06 {
	public static void main(String[] args) {
		int[]lotto = new int[6];
		Random r = new Random();
		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = r.nextInt(45)+1;
			for(int j = 0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);//배열 크기순으로 정렬
		for(int data : lotto) {
			System.out.print(data+" ");
		}
	}
}
