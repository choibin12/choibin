package ch5;
class MyMath2{
	long a,b;
	long add() {//인스턴스메서드
		return a+b;
	}
	static long add(long a, long b) {//클래스 매서드(static메서드)
		return a + b;
	}
}
public class Ex08 {
	public static void main(String[] args) {
		System.out.println(MyMath2.add(200L, 100L));//클래스 메서드 호출
		MyMath2 a =new MyMath2();//인스턴스 생성
		a.a = 200L;
		a.b = 100L;
		System.out.println(a.add());//인스턴스 매서드 호출
	}
}
