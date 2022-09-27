package ch6;

class Outer {
	private int outerIv = 0;
	private static int outerCv = 0;
	class InstanceInner{
		int iiv = outerIv;//외부클래스의 private 멤버도 접근가능
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
//스태틱클래스는 외부클래스의 인스턴스변수에 접근 불가능
		//		int siv = outerIv; 
				static int scv = outerCv;
	}
	void myMethod() {
		 int lv = 0; //값이 바뀌지않는변수는 상수로 간주
		final int Lv = 0;	// JDK1.8부터 final생략가능
		class LocalInner{
			int iiv = outerIv;
			int iiv2 = outerCv;
			int iiv3 = lv;//JDK1.8부터 에러아님
			int iiv4 = Lv;
			
		}
	}
	


}
