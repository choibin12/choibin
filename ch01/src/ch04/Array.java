package ch04;

public class Array {

	public static void main(String[] args) {
		int[]arr = new int[10];//길이가 5인 int배열 arr생성
		System.out.println(arr.length);
		for(int i=0; i<=10; i++) {
			System.out.println("arr["+i+"] ="+arr[i]);
		}
	}

}
