package ch6;

public class InnerTest2 {
	class InstanceInner{
		int iv = 100;
//		static int cv = 100;  //static변수 선언불가	
		final static int CONST = 100; // final static은 상수이므로 가능
	}
	static class StaticInner {
		int iv = 200;
		static int cv = 200; //static클래스만 static멤버정의가능
	}
	void myMethod() {
		class LocalInner{
			int iv = 300;
//			static int cv = 300; //static변수 선언불가
			final static int CONST = 300; //final static은 상수이므로 허용
		}
	}
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
//		System.out.println(InstanceInner.iv);	//에러
		System.out.println(StaticInner.cv);	
//		System.out.println(StaticInner.iv);	//에러
//		System.out.println(LocalInner.CONST);//에러. 지역내부클래스는 메서드 내에서만	
	}

}
