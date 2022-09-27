package array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 크기 입력 : ");
		int size = sc.nextInt();
		int sum = 0;
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] 입력 : ");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) { // (data:arr)로 하기
			System.out.print(arr[i] + " ");
			sum += arr[i];

		}
		int max = arr[0],min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
//		for (int data : arr) {
//			System.out.print(data+" ");
//			sum += data;
//			
//		}
		System.out.println();
		System.out.println("합 = " + sum);
		System.out.println("최댓값 = " + max);
		System.out.println("최솟값 = " + min);
	}

}
/*
 * 배열 크기 입력 : 3 ar[0] 입력 : 25 ar[1] 입력 : ~~ ar[2] 입력 : ~~ 25 ~~ ~~ 합 = ~~~
 */
