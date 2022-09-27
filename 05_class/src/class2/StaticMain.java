package class2;

class StaticTest{
	private int a;//필드 Iv Instance Variable
	private static int b;//필드 Cv Class Variable
	
	static {
		System.out.println("초기화영역");
		b=7;
	}
	public StaticTest(){
		System.out.println("기본생성자");
		this.a =7;
	}
	public void calc() {
		a++;
		b++;
	}
	public void disp() {
		System.out.println("a = "+a+"\tb = "+b);
	}
	public static void output() {
		System.out.println("static method");
//		System.out.println("a = "+a+"\t"+"b = "+b); a 가 iv이기 때문에 오류
	}
}
public class StaticMain {

	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.calc();
		st.disp();
		System.out.println();
		st.output();
		StaticTest.output();
		StaticTest st1 = new  StaticTest();
		st1.calc();
		st1.disp();
		System.out.println();
		StaticTest st2 = new  StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
	}

}
