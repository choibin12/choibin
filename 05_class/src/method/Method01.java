package method;

public class Method01 {
// static method ,, get~~~() void method ,, set~~~()   결과값이 boolean is~~~()
	public static void main(String[] args) {
		Method01 m = new Method01();
		int sum = m.add(3, 5);
		int sub = m.sub2(3, 5);
		int mul = m.mul(3,5);
		double div = m.div(3,5);
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(String.format("%.3f", div));
	}
	public int add(int a, int b) {//구현 ,  int x,y-> 인수(argument),매개변수(parameter)
		return a+b;
	}
	public int sub2(int a, int b) {//인수는 항상 따로선언
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public double div(double a, int b) {
		return a/b;
	}
}