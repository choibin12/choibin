package class_;

import java.util.Scanner;
//생성자 써서 다시 해보기
/*public MemberDTO(){}
 * 
 * 
 */
public class MemberDTO {
	private String name;
	private String age;
	private String phone;
	private String address;
	Scanner sc = new Scanner(System.in);
	void setData() {
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("나이 입력 : ");
		age = sc.next();
		System.out.print("전화번호 입력 : ");
		phone = sc.next();
		System.out.print("주소 입력 : ");
		address = sc.next();
	}
	void setNewData() {
		System.out.print("수정 할 이름 입력 : ");
		name = sc.next();
		System.out.print("수정 할나이 입력 : ");
		age = sc.next();
		System.out.print("수정 할전화번호 입력 : ");
		phone = sc.next();
		System.out.print("수정 할주소 입력 : ");
		address = sc.next();
	}
	String getName() {
		return name;
	}
	String getAge() {
		return age;
	}
	String getPhone() {
		return phone;
	}
	String getAddress() {
		return address;
	}
	@Override
		public String toString() {
			return name +"\t"+age+"\t"+phone+"\t"+address;
		}
}
/*클럽 회원관리 프로그램 작성
여기는 폐쇄적인 모임으로 회원은 총 5명으로 한다
회원의 정보는 이름, 나이, 핸드폰, 주소로 설정한다
회원 가입, 수정, 출력 프로그램을 작성하시오
각각의 메소드로 구성하시오*/