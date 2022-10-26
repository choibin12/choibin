package user.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserDeleteService implements UserService{

	@Override
	public void execute() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제 하고자 하는 아이디 입력 : ");
		String id = sc.next();
		UserDAO userDAO = UserDAO.getInstance();
		UserDTO userDTO = userDAO.getUser(id);
		if (userDTO != null) {
			  Map<String, String>map = new HashMap<String, String>();
			  map.put("id", id);
			  userDAO.delete(map); 
			  System.out.println("데이터를 삭제 수정하였습니다");
			 }else {
				 System.out.println("삭제 하고자 하는 아이디가 없습니다");
			}
	}

}