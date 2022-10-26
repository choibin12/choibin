package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain {
	private Connection conn;
	private PreparedStatement pstmt;
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "bit";
	public InsertMain(){//driver loading
//		OracleDriver <- 파일명만 알고있음 클래스인지 인터페이스인지 모름 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//import 필요없음
			System.out.println("driver loading success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public void getConnection(){
		try {
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("connection success");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void insertArticle() throws SQLException {
		//접속
		this.getConnection();
		
		//PreparedStatement psmt = Connection 의 preparestatement() 를 통해 생성
		try {
			Scanner sc = new Scanner(System.in);
			pstmt = conn.prepareStatement("insert into dbtest values(?,?,?,sysdate)");
			System.out.print("이름 입력 : ");
			pstmt.setString(1, sc.next());
			System.out.print("나이 입력 : ");
			pstmt.setInt(2, sc.nextInt());
			System.out.print("키 입력 : ");
			pstmt.setDouble(3, sc.nextDouble());
			int su = pstmt.executeUpdate();//실행 - 갯수리턴
			System.out.println(su+"개의 행 이 삽입되었습니다");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(pstmt!=null) pstmt.close();
			if(conn!=null)conn.close();
		}
	}
	public static void main(String[] args) throws SQLException {
		
		InsertMain insertMain = new InsertMain();
		insertMain.insertArticle();
	}

}
/*
driver loading 하는법 

Connection 쓰는법
Oracle Thin Client

sid - jdbc:oracle:thin:@ip-address:1521:<sid>

cdb - jdbc:oracle:thin:@ip-address:1521/<service>
*/