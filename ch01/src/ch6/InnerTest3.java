package ch6;

public class InnerTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 oc = new Outer2(); //외부클래스의 인스턴스를 먼저 생성해야 인스턴스 변수 사용가능
		Outer2.InstanceInner ii = oc.new InstanceInner();//인스턴스를 생성가능
		
		System.out.println("ii.iv :"+ii.iv);
		System.out.println("Outer2.StaticInner.cv :"+Outer2.StaticInner.cv);
		//스태틱 내부 클래스의 인스턴스는 외부클래스를 먼저 생성하지 않아도 된다
		Outer2.StaticInner si = new Outer2.StaticInner();
		System.out.println("si.iv :"+si.iv);
	}

}
