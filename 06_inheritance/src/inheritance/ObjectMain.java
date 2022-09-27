package inheritance;


class Test{  //JAVA의 모든 클래스는 Object 로부터 상속받는다
	public String toString() {
		return getClass()+"!dd";
	}
//	public boolean equals(Object) {}//참조값 비교
//	public int hashCode() {//문자열을 10진수로 변환 표현 할 수 있는 문자열은 무한대이기 때문에 10진수 표현을 다 할수 없다.
//		
//	}
}
//
public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t : "+t);
		System.out.println("객체 t : "+t.toString());
		System.out.println("객체 t : "+t.hashCode());//주소를 10진수로 반환
		System.out.println();
		String str = "apple";
		System.out.println("객체 str = "+str);
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb : "+(aa==bb));//주소 - false
		System.out.println("aa.equals(bb) : "+aa.equals(bb));// 문자열 - true , String에있는 equals 만 문자열 비교 Object에있는 equals는 주소 비교
		System.out.println();
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc==dd : "+(cc==dd));//주소 - false
		System.out.println("cc.equals(dd) : "+cc.equals(dd));//주소 - false
		System.out.println();
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("ee==ff : "+(ee==ff));//주소 - false
		System.out.println("ee.equals(ff) : "+ee.equals(ff));// override 되어서 문자열비교
		
		
	}

}
/*class String extends Object(){
 *  @Override
 *  public String toString(){}
 *  	public boolean equals(Object) {}//문자열 비교
 * 
 * class Object(){
 *    public int ha
 *  @Override
 *  public boolean equals(Object) {}//참조값비교
 *  public String toString(){
 *  	
 * }
 * 
 */
