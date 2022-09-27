package basic;

public class NumberTest {

	public static void main(String[] args) {
		System.out.println(2+3);//5
		System.out.println('2'+'3');//101 아스키코드 결합 2 = 50 , 3 = 51
		System.out.println('2'- 48 + '3'- 48);//문자 -> 숫자로 변환 5 
		System.out.println("2 + 3");//2+3
		System.out.println("2" + "3");//23
		System.out.println(Integer.parseInt("2") + Integer.parseInt("3"));//문자열을 숫자로 변환
		
	}

}
