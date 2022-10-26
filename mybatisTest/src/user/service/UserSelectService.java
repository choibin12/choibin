package user.service;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Select;

import oracle.security.o3logon.a;
import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserSelectService implements UserService {

	public void execute() {
		UserDAO userDAO = UserDAO.getInstance();
		List<UserDTO> rs = userDAO.select();
		for(UserDTO userDTO : rs) {
			System.out.println(userDTO.getName()+"\t"
								+userDTO.getId()+"\t"
								+userDTO.getPwd());
		}
	}
}
