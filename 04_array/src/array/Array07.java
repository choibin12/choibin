package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array07 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int money;
		System.out.print("현금 입력 : ");
		money = sc.nextInt();
		int []lotto = new int[6];
		for(int k=1; k<=money/1000; k++ ) {
			for(int i = 0; i<lotto.length; i++) {
				lotto[i] = r.nextInt(45)+1;
				for(int j = 0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			Arrays.sort(lotto);
			for(int data : lotto) {
				System.out.print(String.format("%3d", data));
			}
			System.out.println();
			if(k%5==0)System.out.println();
		}
	}
}
