package variable;

public class Variable02 {
	static int a; //필드 , 초기화 되어있음
	int b;
	public static void main(String[] args) {
		int a=2; //local Variable 지역변수 , 반드시 초기화 해야함
		int b;
		System.out.println("지역변수 a = "+a);//
		System.out.println("필드 a = "+Variable02.a);//
		System.out.println("필드 b = "+new Variable02().b);//인스턴스변수는 생성후 사용가능
	}

}
