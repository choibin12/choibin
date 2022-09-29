package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionMain2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();//String type Generic
		Scanner sc = new Scanner(System.in);
		list.add("호랑이");
		list.add("호랑이");
		list.add("사자");
		list.add("기린");
		list.add(sc.nextLine());
//		list.add(43.8); Generic 때문에 문자열만 가능 
//		list.add(25); Generic 때문에 문자열만 가능
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		for(String data : list) {
			System.out.println(data);
		}
	}

}
