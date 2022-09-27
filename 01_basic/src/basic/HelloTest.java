package basic;
/*객체지향 프로그램 (OOP) - Object Oriented Programming
 * 함수 - 명령어들의 집합체 method
 * public class,main method
 * console program - 입력,출력 
 * System.in 입력 System.out 출력
 * \n new line  
 * \t tap 
 * 숫자 '문자' "문자열"
 * 		1개
 * 
 */
public class HelloTest {
	public static void main(String[] args) {
		System.out.print("안녕하세요\n");
		System.out.println("반갑습니다");
		System.out.println("사과\t딸기\t바나나");
		System.out.println(25+36);//61
		System.out.println("25+36");//25+36 ""문자열
		System.out.println("25"+"36");//2536 "25","36" 결합
		System.out.println("25+36 = "+(25+36)); // 25+36 = 61 
		System.out.println("25+36 = "+25+36); // 25+36 = 2536 
	}
}
