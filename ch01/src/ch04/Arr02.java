package ch04;

import java.util.Arrays;

public class Arr02 {

	public static void main(String[] args) {
		// TODO Arrays.toString()배열의 모든요소 출력
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = {100,95,90,85,80};
		char[] d = {'a','b','c','d','e'};
		for(int i = 0; i<a.length; i++) {
			a[i] = i+1;
		}
		for(int j=0; j<b.length; j++) {
			b[j] = (int)(Math.random()*10) + 1;
		}
		for(int i = 0; i<a.length; i++) {
			System.out.print("a["+i+"]="+a[i]+",");
		}
		System.out.println();
		for(int i = 0; i<b.length; i++) {
			System.out.print("b["+i+"]="+b[i]+",");
		}
		System.out.println();
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
	}

}
