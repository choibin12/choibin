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
		int i = 0;
		int sw = 0;
		while(iterator.hasNext()) {
			if(iterator.next().getName().equals(name)) {
				iterator.remove();
				sw++;
			}
			i++;
			if(i==list.size())break;
		}
		if(sw==0) {
			System.out.println("삭제 할 이름이 없습ㄴ디ㅏ");
		}else {
			System.out.println("모든 데이터를 삭제 헸습니다");
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