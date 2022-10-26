package board.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import board.bean.BoardDTO;


public class BoardDAO {
	private SqlSessionFactory sqlSessionFactory;
	private static BoardDAO boardDAO = new BoardDAO();
	
	public static BoardDAO getInstance() {
		return boardDAO;
	}
	public BoardDAO() {
		try {
			
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);//생성 (인터페이스)
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public int boardWrite(Map<String, String>map) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int su = sqlSession.insert("boardSQL.write",map);
		sqlSession.commit();
		sqlSession.close();
		return su;
	}
	public List<BoardDTO> boardlist(Map<String,Integer> map) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<BoardDTO>list = sqlSession.selectList("boardSQL.list",map);
		sqlSession.close();
		return list;
	}
	public int getTotalA() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		String sql ="select count(*)from board";
		int totalA = sqlSession.selectOne("boardSQL.gettotala");
		sqlSession.close();
		return totalA;
		
	}
	public BoardDTO boardListSelect(Map<String, Integer>map) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BoardDTO boardDTO = (BoardDTO) sqlSession.selectOne("boardSQL.listselect",map);
		sqlSession.close();
		return boardDTO;
	}
	public void hitupdate(Map<String, Integer>map) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("boardSQL.hitupdate",map);
		sqlSession.commit();
		sqlSession.close();
		
	}
}
