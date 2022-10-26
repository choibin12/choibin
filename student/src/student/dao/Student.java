package student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Student {
	private Connection conn;
	private PreparedStatement pstmt;
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "bit";
	private ResultSet rs;//ResultSet 에 크기를 구해오는 함수 x
	Scanner sc = new Scanner(System.in);
	public Student() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
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
	public void insertArticle() throws SQLException {
		//접속
		this.getConnection();
		while(true) {
			System.out.println("****************\r\n"
					+ " 1. 학생\r\n"
					+ " 2. 교수\r\n"
					+ " 3. 관리자\r\n"
					+ " 4. 이전메뉴\r\n"
					+ "****************");
			System.out.print("번호 입력 : ");
			int num = sc.nextInt();
			if(num==4)break;
			//PreparedStatement pstmt = Connection 의 preparestatement() 를 통해 생성
			else if(num>0&&num<4) {
			try {
			pstmt = conn.prepareStatement("insert into student  values(?,?,?)");
			System.out.print("이름 입력 : ");
			pstmt.setString(1, sc.next());
			if(num==1) {
					System.out.print("학번 입력 : ");
					pstmt.setInt(2, sc.nextInt());
					pstmt.setInt(3, num);
					int su = pstmt.executeUpdate();//실행 - 갯수리턴
					System.out.println(su+"개의 행 이 삽입되었습니다");

					}
			else if(num==2) {
					System.out.print("과목 입력 : ");
					pstmt.setString(2, sc.next());
					pstmt.setInt(3, num);
					int su = pstmt.executeUpdate();//실행 - 갯수리턴
					System.out.println(su+"개의 행 이 삽입되었습니다");

					}
			else if(num==3) {
					System.out.print("부서 입력 : ");
					pstmt.setString(2, sc.next());
					pstmt.setInt(3, num);
					int su = pstmt.executeUpdate();//실행 - 갯수리턴
					System.out.println(su+"개의 행 이 삽입되었습니다");

					} 
				}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					if(pstmt!=null) pstmt.close();
					if(conn!=null)conn.close();
					break;
				}
			}else {
				System.out.println("1부터 4까지의 숫자를 입력하십시오");
			}
		}

	}
	public void selectArticle() throws SQLException {
		getConnection();//접속
		while(true) {
			System.out.println("****************\r\n"
					+ " 1. 이름 검색 \r\n"
					+ " 2. 전체 검색\r\n"
					+ " 3. 이전메뉴\r\n"
					+ "****************");
			System.out.print("번호 입력 : ");
			int num = sc.nextInt();
			String sql = null;
			if(num==3)break;
			if(num==1)
				sql = "select * FROM STUDENT where name like ?";
			else if(num==2)
				sql = "select * FROM STUDENT";
			try {
				if(num==1) {
					System.out.print("검색할 이름 입력");
					String name = sc.next();
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, "%"+name+"%");
					rs = pstmt.executeQuery();//ResultSet 에 테이블을 리턴 , rs.next() 현위치에 항목이있으면 t,없으면 f
				} 
				else if(num==2) {
					pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery();//ResultSet 에 테이블을 리턴 , rs.next() 현위치에 항목이있으면 t,없으면 f
				} 
				while(rs.next()) {
					System.out.print("이름 : "+rs.getString("name"));
					if(rs.getInt("code")==1) {
						System.out.print("\t학번 : "+rs.getString("value"));
					}
					else if(rs.getInt("code")==2) {
						System.out.print("\t과목 : "+rs.getString("value"));
					}
					else {
						System.out.print("\t부서 : "+rs.getString("value"));
					}
					System.out.println();
				}
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(rs!=null)rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
				break;
			}
		}
	}
	public void deleteArticle() throws SQLException {
		getConnection();
		System.out.print("삭제를 원하는 이름 입력 : ");
		String name = sc.next();
		try {
			pstmt = conn.prepareStatement("DELETE student where name = ?");
			pstmt.setString(1, name);
			int su = pstmt.executeUpdate();
			if(su!=0)System.out.println("삭제 완료");
			else System.out.println("삭제 할 이름이 없습니다");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		}

	}
	public void menu() throws SQLException {
		while(true) {
			System.out.println("****************\r\n"
					+ " 관리\r\n"
					+ "****************\r\n"
					+ " 1. 입력\r\n"
					+ " 2. 검색\r\n"
					+ " 3. 삭제\r\n"
					+ " 4. 종료\r\n"
					+ "****************");
			System.out.print("번호 입력 : ");
			int num = sc.nextInt();

			if(num==1) {
				insertArticle();
			}
			else if(num==2) {
				selectArticle();
			}
			else if(num==3) {
				deleteArticle();
			}
			else if(num==4) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else System.out.println("1~4까지만 입력하세요");

		}
	}

	public static void main(String[] args) throws SQLException {
		Student s = new Student();
		s.menu();

	}

}
