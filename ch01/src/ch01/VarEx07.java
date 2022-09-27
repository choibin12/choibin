package ch01;

public class VarEx07 {

	public static void main(String[] args) {
	//	문자열 에서 숫자로 변환 Integer.parseInt("")
	// 
		String str = "3";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(0)-'0');
		System.out.println('3'-'0'+1);
		System.out.println(Integer.parseInt(str)+1);
		System.out.println("3"+1);
		System.out.println('3'+1);
		System.out.println((char)(3+'0'));
	}

}
