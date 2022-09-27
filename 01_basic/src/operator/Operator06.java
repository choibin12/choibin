package operator;
//부정연산자 !     !true = false !false = true
public class Operator06 {

	public static void main(String[] args) {
		boolean a = 25>46;
		System.out.println("a = "+a);//false
		System.out.println("!a = "+!a);//true
		String b = "apple";//literal 생성
		String c = new String("apple");
		System.out.println("b == c "+ (b==c ? "같다" : "다르다")); //주소값
		System.out.println("b != c "+ (b!=c ? "참" : "거짓"));
		System.out.println();
		System.out.println("b.equals(c) : "+(b.equals(c)? "같다" : "다르다"));// .equals 문자열 비교
		System.out.println("!b.equals(c) : "+(!b.equals(c)? "참" : "거짓"));
		
	}

}
