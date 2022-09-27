package class2;

public class StringMain {

	public static void main(String[] args) {
		String a = "apple";
		String b = "apple";
		if(a==b) System.out.println("a와b의 참조값은 같다");
		else System.out.println("a와b의 참조값은 다르다");
		if(a.equals(b)) System.out.println("a와b의 문자열은 같다");
		else System.out.println("a와b의 문자열은 다르다");
		System.out.println();
		
		String c = new String("apple");
		String d = new String("apple");
		if(c==d) System.out.println("c와d의 참조값은 같다");
		else System.out.println("c와d의 참조값은 다르다");
		if(c.equals(d)) System.out.println("c와d의 문자열은 같다");
		else System.out.println("c와d의 문자열은 다르다");
		System.out.println();
		
		String e = "오늘 날짜는 "+ 2022 + 9 + 27;
		System.out.println("e : "+e);
		System.out.println("문자열 크기 = "+e.length());
		for(int i=0; i<e.length(); i++) {
			System.out.println(i+" : "+e.charAt(i));
		}
		System.out.println();
		System.out.println("부분 문자열 추출 = "+e.substring(7));//7번부터~
		System.out.println("부분 문자열 추출 = "+e.substring(7,11));//7번부터 11번 전까지
		
		System.out.println("대문자 변경 = "+"Hello".toUpperCase());//HELLO
		System.out.println("소문자 변경 = "+"Hello".toLowerCase());//hello
		System.out.println();
		System.out.println("문자열 검색 = "+e.indexOf("짜"));//4번째
		System.out.println("문자열 검색 = "+e.indexOf("날짜"));//3번째
		System.out.println("문자열 검색 = "+e.indexOf("ㅇㅇ"));//-1,If no such value of k exists, then -1 is returned
		System.out.println();
		System.out.println("문자열 치환 = "+e.replace("날짜", "일자"));//오늘 일자는 2022927 : 날짜 ->일자
	}

}
/*문자열은 편집이 안되므로 메모리 4번생성
 * JVM에 의해서 삭제시 Garbage Collector 로 보낸다
 * Garbage Collector가 실행되면 컴퓨터는 멈춘다.
 * "오늘 날짜는"
 * "오늘 날짜는 2022"
 * "오늘 날짜는 20229"
 * e---->"오늘 날짜는 2022927"
 */
