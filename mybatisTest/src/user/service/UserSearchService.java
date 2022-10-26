package user.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserSearchService implements UserService {

	@Override
	public void execute() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.이름");
		System.out.println("2.아이디");
		System.out.print("번호선택 : ");
		int num = sc.nextInt();
		UserDAO userDAO = UserDAO.getInstance();
		Map<String, String>map = new HashMap<String, String>();
			if (num == 1) {
				System.out.print("찾고자 하는 이름 입력");
				String name = sc.next();
				map.put("name", name);
				
			} else if (num == 2) {
				System.out.print("찾고자 하는 아이디 입력");
				String id = sc.next();
				map.put("id", id);

			}
			List<UserDTO> rs = userDAO.search(map);
			if(rs.size()==0)System.out.println("no value");
			for (UserDTO userDTO : rs) {
				System.out.println(userDTO.getName() + "\t" + userDTO.getId() + "\t" + userDTO.getPwd());
			}

	}

}
