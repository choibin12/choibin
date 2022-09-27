package ch6;
class Outer3{
	int value = 1;
	class Inner{
		int value = 2;
		void method() {
			int value = 3;
			System.out.println("value : "+value);
			System.out.println("this.value : "+this.value);
			System.out.println("Outer3.this.value : "+Outer3.this.value);
		}
	}
}
public class InnerTest4 {

	public static void main(String[] args) {
			Outer3 outer = new Outer3();
			Outer3.Inner inner = outer.new Inner();
			inner.method();
	}

}
