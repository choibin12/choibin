package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort implements Comparable<Integer>{
	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args) {
		String [] ar = {"오렌지","apple","banana","pear","peach","applemango"};
		
		System.out.print("정렬 전 = ");
		for(String data : ar ) {
			System.out.print(data+"\t");
		}
		Arrays.sort(ar);
		System.out.println();
		System.out.print("정렬 후 = ");
		for(String data : ar ) {
			System.out.print(data+"\t");
		}
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 40);
		PersonDTO cc = new PersonDTO("죠르디", 30);
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		System.out.println("나이로 오름차순");
		System.out.println("정렬 전");
		for(PersonDTO data : list) {
			System.out.println(data);
		}
		Collections.sort(list);
		System.out.println();
		System.out.println("정렬 후");
		for(PersonDTO data : list) {
			System.out.println(data);
		}
		System.out.println("이름내림차순");
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {
			
			@Override
			public int compare(PersonDTO o1, PersonDTO o2) {
				return o1.getName().compareTo(o2.getName()); //-1 1 0
			}
		};
		
		System.out.println("정렬 전");
		for(PersonDTO data : list) {
			System.out.println(data);
		}
		Collections.sort(list, com);
		System.out.println();
		System.out.println("정렬 후");
		for(PersonDTO data : list) {
			System.out.println(data);
		}

	}
	
	
}
