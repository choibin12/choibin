package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class CollectionMain {

	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add("호랑이");
		coll.add("호랑이");
//		coll.add(25); Generic 때문에 문자열만 가능
//		coll.add(43.8); Generic 때문에 문자열만 가능 
		coll.add("사자");
		coll.add("기린");
//		coll.get(0);
		Iterator<String> it = coll.iterator(); //생성
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//it.hasNext() = 현재 위치에 항목이 있으면 참,없으면 거짓
		//it.next() = 현재 위치에 항목을 꺼내서 저장하고 다음위치로 이동
	}

}
/*
implements 를 하면 모든 추상클래스를 override해주어야 하는데 
대신 override 해주는 클래스를 만든다
*/