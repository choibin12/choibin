package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectMain {
	private Connection conn;
	private PreparedStatement pstmt;
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "bit";
	private ResultSet rs;//ResultSet 에 크기를 구해오는 함수 x
	public SelectMain() {
		try {
			Class.forName("driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getConnection(){
		try {
			conn = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void selectArticle() throws SQLException {
		String sql = "select * from dbtest";
		getConnection();//접속
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();//ResultSet 에 테이블을 리턴 , rs.next() 현위치에 항목이있으면 t,없으면 f
			while(rs.next()) {
				System.out.println(rs.getString("name")+"\t"
						+rs.getInt("age") +"\t"
						+rs.getDouble("height")+"\t"
						+rs.getString("logtime"));
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs!=null)rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		}
	}

	public static void main(String[] args) throws SQLException {
		
		SelectMain selectMain = new SelectMain();
		selectMain.selectArticle();
	}
	

}
