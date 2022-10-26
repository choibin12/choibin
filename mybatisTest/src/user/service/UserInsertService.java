package user.service;

import java.util.Scanner;

import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserInsertService implements UserService{

	@Override
	public void execute() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름입력 : ");
		String name = sc.next();
		System.out.print("아이디입력 : ");
		String id = sc.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = sc.next();
		UserDTO userDTO = new UserDTO();
		userDTO.setName(name);
		userDTO.setId(id);
		userDTO.setPwd(pwd);
		//DB
		UserDAO userDAO = UserDAO.getInstance();
		userDAO.write(userDTO);
		//ung dap
		System.out.println("데이터를 db에 저장ㅇㅇ");
	}

}
