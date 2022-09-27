package method;

public class Method02 {
	public void disp() {
		System.out.println("non-static method");
	}
	
	public static void output() { // 구현
		System.out.println("static method");
	}

	public static void main(String[] args) {
		Method02.output();//클래스자체에서 함수 output호출
		output();
		Method02 m = new Method02();//Method02 객체 m생성
		m.disp();//객체 m에서disp()함수 호출
		
	}

}
