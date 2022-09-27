package class_;

import java.util.Scanner;

public class MemberService {
	private MemberDTO[]ar = new MemberDTO[5];
	Scanner sc = new Scanner(System.in);
	void menu(){
		while(true){
			System.out.println("*************\r\n"
					+ "   1. 가입\r\n"
					+ "   2. 출력\r\n"
					+ "   3. 수정\r\n"
					+ "   4. 탈퇴\r\n"
					+ "   5. 끝내기\r\n"
					+ "*************");

			System.out.print("번호 : ");
			int menunum = sc.nextInt();

			if(menunum==1) {
				insert();
			}
			else if(menunum==2) {
				list();
			}
			else if(menunum==3) {
				update();
			}
			else if(menunum==4) {
				delete();
			}
			else if(menunum==5) {//5번종료
				break;
			} 
		}
	}
	void insert() {
		for(int i=0; i<ar.length; i++) {
			if(ar[i]==null) {
				ar[i] = new MemberDTO();//객체 생성
				ar[i].setData();//ar[i] 의 데이터 입력 
				System.out.println("1 low created");
				break;//break를 안걸면 다음 배열로 넘어감
			}else if(ar[ar.length-1]!=null){
				System.out.println("5명의 정원이 꽉 찼습니다...");
				return;
			}
		}
		int count=0;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]==null) {
				count++;
			}
		}
		System.out.println(count+"자리 남았습니다");
	}

	void list() {
		System.out.println("이름\t나이\t번호\t주소");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]!=null) {//빈곳 빼고 출력
				System.out.println(ar[i].toString());  
			}
		}
	}

	void update() {
		System.out.print("찾을 전화번호 입력 : ");
		String p = sc.next();
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i]!=null&&ar[i].getPhone().equals(p)) {//ar[i]가 빈값이아니고 ar[i]의 phone값과 입력값이 같을때
				
				System.out.println(ar[i]);
				ar[i].setNewData();//데이터 새로 입력
				System.out.println("1 row(s) updated");
				break;
			}
		}
		if(i==ar.length) {
			System.out.println("찾는 회원이 없습니다");
			return;
		}
	}

	void delete() {
		System.out.print("찾을 전화번호 입력 : ");
		String p = sc.next();
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i]!=null&&ar[i].getPhone().equals(p)) {//ar[i]가 빈값이아니고 ar[i]의 phone값과 입력값이 같을때
				ar[i]=null; //ar[i] 삭제
				System.out.println("1 row deleted");
				break;
			}
		}
		if(i==ar.length) {
			System.out.println("찾는 회원이 없습니다");
			return;
		}
	}


}
//필드 끝  -> method설정 //삭제 = null
//끝내기할때까지 무한루프	
/*    1명의 정보 DTO  data transfer object //VO  value object    DTO에 정보저장 배열, Service에 메뉴에있는 함수 만들기       
클럽 회원관리 프로그램 작성
여기는 폐쇄적인 모임으로 회원은 총 5명으로 한다
회원의 정보는 이름, 나이, 핸드폰, 주소로 설정한다
회원 가입, 수정, 출력 프로그램을 작성하시오
각각의 메소드로 구성하시오

[실행결과]
menu()
*************
   1. 가입
   2. 출력
   3. 수정
   4. 탈퇴
   5. 끝내기
*************
  번호 : 

[1번 경우]
insert()
5명의 정원이 꽉 찼습니다...//5명이 꽉 차면 
----------------------
이름 입력 :
나이 입력 :
핸드폰 입력 :
주소 입력 :

1 row created
xx자리 남았습니다

[2번 경우]//if 걸기 아니면 에러 
list()
이름   나이   핸드폰      주소

[3번 경우]
update()
핸드폰 번호 입력 : 010-123-1234
홍길동   25   xxx   xxx

수정 할 이름 입력 : 
수정 할 핸드폰 입력 : 
수정 할 주소 입력 : 

1 row(s) updated
--------------------
핸드폰 번호 입력 : 010-123-1235
찾는 회원이 없습니다

[4번 경우]
delete()
핸드폰 번호 입력 : 
1 row deleted

핸드폰 번호 입력 : 
찾는 회원이 없습니다
*/