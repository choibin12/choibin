package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateMain {
	private Connection conn;
	private PreparedStatement psmt;
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "bit";
	public UpdateMain() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver success loading");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("connection succes");
		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateArticle() throws SQLException {
		this.getConnection();
		Scanner sc = new Scanner(System.in);

		try {
			psmt = conn.prepareStatement("update dbtest set age = age+1 ,height = height+1 where name like ?");// 조건부 '' 전부 ?%는 같이못쓰임
			System.out.print("수정할 이름 입력 : ");
			String name = sc.next();
			psmt.setString(1, "%"+name+"%");//문법 쓸때 주의 ' '안의 것은 다 입력할때  "%"+name+"%"
			int su = psmt.executeUpdate();
			System.out.println(su+"개의 행 이 수정되었습니다");
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(psmt!=null) psmt.close();
			if(conn!=null) conn.close();
		}
		
	}
	public static void main(String[] args) throws SQLException {
		UpdateMain updateMain = new UpdateMain();
		updateMain.updateArticle();

	}

}
