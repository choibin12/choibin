package ch6;
public class MyParent{
	private int prv;//같은클래스 내에서
			int dft;//같은 패키지
	protected int prt;//같은패키지,자손(다른패키지)
	public int pub;//접근제한 없음
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}
 class MyParentTest {

	public static void main(String[] args) {
		MyParent p = new MyParent();
//에러	System.out.println(p.prv);
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
		
	}

}
