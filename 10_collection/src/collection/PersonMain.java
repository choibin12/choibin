package collection;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
	public  ArrayList<PersonDTO> init() {
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 40);
		PersonDTO cc = new PersonDTO("죠르디", 30);
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();//ArrayList에 aa,bb,cc 주소저장
		list.add(aa);
		list.add(bb);
		list.add(cc);
		return list;//ArrayList list 의 주소값 리턴
	}
	
	public static void main(String[] args) {
		PersonMain m = new PersonMain();
		ArrayList<PersonDTO> list = m.init();//호출
		for(PersonDTO data : list) {
			//System.out.println("이름 = "+data.getName()+"\t나이 = "+data.getAge());
			System.out.println(data);
		}
		
	}

}
