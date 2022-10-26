package user.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserUpdateService implements UserService {

	@Override
	public void execute() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		UserDAO userDAO = UserDAO.getInstance();
		UserDTO userDTO = userDAO.getUser(id);
		if (userDTO != null) {
			System.out.print("수정 할 이름 입력 : ");
			String name = sc.next();
			  System.out.print("수정 할 비밀번호 입력 :"); 
			  String pwd = sc.next();
			  Map<String, String>map = new HashMap<String, String>();
			  map.put("name", name);
			  userDAO.update(map); 
			  System.out.println("데이터를 수정하였습니다");
			 }else {
				 System.out.println("찾고자하는 아이디가 없습니다");
			}
//		UserDTO dto = new UserDTO();
//		dto.setId(id);
//		UserDAO userDAO = UserDAO.getInstance();
//		List<UserDTO> rs = userDAO.search(dto);
//		if(rs.isEmpty()) {
//			System.out.println("찾고자하는 아이디가 없습니다");
//		}else  {
//			UserDTO userDTO = new UserDTO();
//			System.out.print("수정 할 이름 입력 : ");
//			userDTO.setName(sc.next());
//			System.out.print("수정 할 비밀번호 입력 :");
//			userDTO.setPwd(sc.next());
//			userDTO.setId(id);
//			userDAO.update(userDTO);
//			System.out.println("데이터를 수정하였습니다");
//		}

	}

}
