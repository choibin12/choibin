package ch04;

import java.util.Arrays;

public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcde";
		System.out.println(a);
		System.out.println(a.length());
		char c = a.charAt(2);
		System.out.println(c);
		String b = a.substring(1,3);
		String d = a.substring(1);
		String e = a.substring(1,a.length());
		System.out.println(b);
		System.out.println(d);
		System.out.println(e);
		
		int[]arr = {0,1,2,3,4};
		int [][]arr2 = {{11,12},{21,22}};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2));
		String[][] str2D = {{"aaa" ,"bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa" ,"bbb"},{"AAA","BBB"}};
		System.out.println(Arrays.deepToString(str2D));
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
	}


}
