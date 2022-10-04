package nested;

public class Outer {
	private String name;
	public void output() {
		Inner inner = new Inner();
		System.out.println("이름 = "+this.name+"\t나이 = "+inner.age);

	}
	class Inner { 
		private int age;
		
		public void disp() {
			System.out.println("이름 = "+Outer.this.name+"\t나이 = "+this.age);
		}
	}
	public static void main(String[] args) {
		Outer o = new Outer();
		o.name = "홍길동";
		o.output();
		System.out.println();
		Outer.Inner oi = o.new Inner();
		oi.age = 25;
		oi.disp();
		System.out.println();
		Outer.Inner oi2 = o.new Inner();
		oi2.age = 30;
		oi2.disp();
		System.out.println();
//		oi2.name = " "; error 클래스 내부에서만 가능 
		Outer.Inner oi3 = new Outer().new Inner();
		oi3.age = 35;
		oi3.disp();
		
	}
}
