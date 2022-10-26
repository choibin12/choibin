package user.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import user.bean.UserDTO;

public class UserDAO{
	private SqlSessionFactory sqlSessionFactory;
	private static UserDAO userDAO = new UserDAO();

	public static UserDAO getInstance() {
		return userDAO;
	}
	//mybatis-config 읽어오기
	public UserDAO() {
		try {
			
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);//생성 (인터페이스)
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void write(UserDTO userDTO) {
		SqlSession sqlSession = sqlSessionFactory.openSession();//생성 (인터페이스)
		sqlSession.insert("userSQL.write",userDTO);
		sqlSession.commit();
		sqlSession.close();
	}
	public List<UserDTO> select() {
		SqlSession sqlSession = sqlSessionFactory.openSession();//생성 (인터페이스)
		List<UserDTO> selectUserDTO = sqlSession.selectList("userSQL.select");
		sqlSession.close();
		return selectUserDTO;
	}
	public List<UserDTO> search(Map<String, String>map) {
		SqlSession sqlSession = sqlSessionFactory.openSession();//생성 (인터페이스)
		List<UserDTO> searchUserDTO = sqlSession.selectList("userSQL.search",map);
		sqlSession.close();
		return searchUserDTO;
		
	}
	public void update(Map<String, String>map) {
		SqlSession sqlSession = sqlSessionFactory.openSession();//생성 (인터페이스)
		sqlSession.insert("userSQL.update",map);
		sqlSession.commit();
		sqlSession.close();

	}
	public UserDTO getUser(String id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();//생성 (인터페이스)
		UserDTO getUserDTO = sqlSession.selectOne("userSQL.getuser",id);
		sqlSession.close();
		return getUserDTO;
		
		
	}
	public void delete(Map<String, String> map) {
		SqlSession sqlSession = sqlSessionFactory.openSession();//생성 (인터페이스)
		sqlSession.insert("userSQL.delete",map);
		sqlSession.commit();
		sqlSession.close();
		// TODO Auto-generated method stub
		
	}

}
