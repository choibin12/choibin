package user.main;

import java.util.Scanner;

import user.service.UserDeleteService;
import user.service.UserInsertService;
import user.service.UserSearchService;
import user.service.UserSelectService;
import user.service.UserService;
import user.service.UserUpdateService;

public class UserMain {

	public static void main(String[] args) {
		UserMain um = new UserMain();
		um.menu();
		System.out.println("종료ㅇㅇ");
	}
	public void menu() {
		Scanner sc = new Scanner(System.in);
		int num;
		UserService userservice = null;
		
		while (true) {
			System.out.println("****************\r\n"
					+ " 1. 입력\r\n"
					+ " 2. 출력\r\n"
					+ " 3. 수정\r\n"
					+ " 4. 삭제\r\n"
					+ " 5. 검색\r\n"
					+ " 6. 종료\r\n"
					+ "****************");
			System.out.print("번호 입력 : ");
			num = sc.nextInt();
			if(num==1) {
				userservice = new UserInsertService();
				
			//입력	
			}
			else if(num==2) {
				userservice = new UserSelectService();
			//출력
			}
			else if(num==3) {
			//수정
				userservice = new UserUpdateService();
			}
			else if(num==4) {
			//삭제
				userservice = new UserDeleteService();
			}
			else if(num==5) {
				userservice = new UserSearchService();
				//검색
			}
			else if(num==6) {
				break;
			}else {
				System.out.println("1부터 6까지 숫자만ㅇ ㅣㅂ력");
			}
			userservice.execute();
		}//whlle
	}//menu()

}
