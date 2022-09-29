package sungjuk;

import java.util.ArrayList;

public class SungJukList  implements SungJuk  {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(SungJukDTO sungJukDTO : list) {
			System.out.println(sungJukDTO);
		}
	}
	
}
/*3. SungJukList.java
- ArrayList에 저장된 모든 데이터를 출력한다.
 
번호   이름   국어   영어   수학    총점   평균
*/
//Dto>Service>