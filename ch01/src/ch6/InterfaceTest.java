package ch6;//직접적인 관계
/*class A{
	public void methodA(B b) {
		b.method();
	}
}
class B{
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.methodA(new B());// A가B를 사용(의존)

	}

}
*/  // 간접적인 관계
class A{
	public void method(I i) {
		i.method();
	}
}
interface I { void method(); }
class B implements I{
	public void method() {
		System.out.println("methodB()");
	}
}
class C implements I {
	public void method() {
		System.out.println("methodB() in C");
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.method(new B());//A가B를 사용
		a.method(new C());//A가C를 사용

	}

}
