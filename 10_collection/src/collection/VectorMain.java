package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("벡터 크기 = "+v.size());//0
		System.out.println("벡터 용량 = "+v.capacity());//기본 용량 10, 10개씩 증가
		System.out.println();
		
		System.out.println("항목 추가");
		for(int i = 1; i<=10; i++) {
			v.add(i+"");//String.valueOf(i)
			System.out.print(v.get(i-1)+" ");//i 시작하면 에러
		}
		System.out.println();
		System.out.println("항목 1개 추가");
		v.addElement(7+"");//중복 허용
		System.out.println("벡터 크기 = "+v.size());//11
		System.out.println("벡터 용량 = "+v.capacity());//20
		for(int i = 0; i<v.size(); i++) {
			System.out.print(v.get(i)+" ");
		}
		System.out.println("\n마지막 항목 삭제");
		v.remove(v.size()-1); //v.remove("7") 을 해버리면 앞에있는 7이 삭제됨
		for(int i = 0; i<v.size(); i++) {
			System.out.print(v.get(i)+" ");
		}
		System.out.println();
		Iterator it = v.iterator(); //생성 - 메서드 이용
			while(it.hasNext()) {//.hasNext() 항목이 있으면 true 없으면 false
				it.next();//항목을 꺼내서 버퍼에 저장하고 다음 위치로 이동
				
			}
		
		
	}

}
