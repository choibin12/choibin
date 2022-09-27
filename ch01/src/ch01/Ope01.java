package ch01;

public class Ope01 {

	public static void main(String[] args) {
//&& and ||or !not > < >= <= == != 산술>비교>논리>대입
//단항 > 이항 > 삼항
//전위형 A=++a; 값이 참조되기전에 증가 ,후위형 A=a++; 값이 참조된 후에 증가
// Math.round() 소수점 첫째자리 반올림 int 값
//
		double pi = 3.141592;
		double shortpi = Math.round(pi*1000)/1000.0;
		System.out.println(shortpi);
		
		int x = 20, y= 3;
		System.out.printf("%d를 %d으로 나누면,\n",x,y);
		System.out.printf("몫은%d이고 나머지는%d입니다\n",x/y,x%y);
		
	}

}
