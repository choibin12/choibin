package ch6;
class AAA {//AAA는 BBB의 외부클래스
	int i = 555;
	BBB b = new BBB();

	class BBB { //BBB는AAA의 내부클래스
		void method() {
//			AAA a = new AAA();
//			System.out.println(a.i);
			System.out.println(i);
	}
	
	}
}
//class CCC {
//	BBB b = new BBB();
//}
public class InnerTest {
	
	public static void main(String[] args) {
//		BBB b = new BBB();
//		b.method();
		AAA a = new AAA();
		a.b.method();
	}

}
