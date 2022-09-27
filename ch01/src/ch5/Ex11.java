package ch5;
/*생성자 - 이름,클래스이름이 같아야함
 리턴값이 없음(void를 안붙임), 모든 클래스는 반드시 생성자를 가져야 함
*/
class Data_1 {
	int value;
	//Data_1(){}  //기본생성자 추가
}
class Data_2 { 
	int value;
	Data_2(){} // 기본 생성자
	Data_2(int x){//매개변수가 있는 생성자
		value = x;
	}
}
public class Ex11 {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();//The constructor Data_2() is undefined
		
	}

}
