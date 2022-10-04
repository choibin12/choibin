package sungjuk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제 할 이름을 입력");
		String name = sc.next();
		Iterator<SungJukDTO>iterator = list.iterator(); 
		int sw = 0;
		while(iterator.hasNext()) {
			if(iterator.next().getName().equals(name)) {
				iterator.remove();//.remove()는 반드시 .next()가 반환하는 데이터 항목을 삭제
				sw++;
			}

		}
		if(sw==0) {
			System.out.println("삭제 할 이름이 없습니다");
		}else {
			System.out.println(sw+"개 의데이터를 삭제 헸습니다");
		}
	}

}
/*
이름은 중복이 되어있다 -> 똑같은 이름이 2개 이상이라면 다 지운다
삭제 할 이름을 입력 : 홍길동
샂게 할 이름이 없습니다.
or
삭제~
*/