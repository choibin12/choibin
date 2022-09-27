package ch01;

public class ArrayTest {
	public static void main(String[] args)
	{
		int[] number = {4,4,4,6,5,7,9,7,5,3};
		int[] counter = new int[10];
		for (int i =0; i<number.length; i++) {
			counter[number[i]]++;
		}
	}

}
