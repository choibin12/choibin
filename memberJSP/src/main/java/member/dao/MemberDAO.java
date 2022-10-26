package member.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import java.util.HashMap;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import member.bean.MemberDTO;

public class MemberDAO {
	private SqlSessionFactory sqlSessionFactory;
	private static MemberDAO memberDAO = new MemberDAO();
	
	public static MemberDAO getInstance() {
		return memberDAO;
	}
	public MemberDAO() {
		try {
			
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);//생성 (인터페이스)
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public int memberWrite(Map<String, String>map) {
		SqlSession sqlSession = sqlSessionFactory.openSession();//생성 (인터페이스)
		int su = sqlSession.insert("memberSQL.write",map);
		sqlSession.commit();
		sqlSession.close();
		
		return su;
	}
	
	
	public String memberlogin(Map<String, String>map) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		String name = sqlSession.selectOne("memberSQL.login",map);
		sqlSession.close();
		return name;
	}
	public boolean idExistId(Map<String, String>map) {
		boolean x = false;
		SqlSession sqlSession = sqlSessionFactory.openSession();
		String id = sqlSession.selectOne("memberSQL.idExistId",map);
		if (id!=null) {
			x = true;
		}
		sqlSession.close();
		return x;
	}
}