package ch5;// static메서드는 인스턴스 변수를 사용할수 없다
class TestClass2{
	int iv;//인스턴스 변수
	static int cv;//클래스변수
	void instanceMethod() {//인스턴스 메서드(객체생성 후 호출가능)
		System.out.println(iv);//인스턴스 변수 사용가능 
		System.out.println(cv);//클래스 변수 사용가능
	}
	static void staticMethod() { //static 메서드 (객체생성없이 호출 가능)
		//System.out.println(iv);// 인스턴스 변수 사용 불가(객체 생성후 호출가능)
		System.out.println(cv);//클래스 변수는 사용가능
	}
}

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
