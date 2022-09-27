package ch5;//스태틱 메서드는 인스턴스 메서드를 호출할 수없다
class TestClass{
	void instanceMethod() {}//인스턴스 메서드
	static void staticMethod() {}//스태틱메서드
	
	void instanceMethod2() {//인스턴스메서드
		instanceMethod();//다른인스턴스 메서드 호출
		staticMethod();//스태틱메서드 호출
		}
	static void staticMethod2() {//스태틱메서드
		//instanceMethod();//인스턴스 메서드 호출불가능
		staticMethod();//스태틱메서드는 호출 가능
	}//스태틱 메서드는 인스턴스 메서드를 호출할 수없다
}
public class Ex09_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
