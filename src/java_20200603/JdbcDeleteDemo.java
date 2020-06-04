package java_20200603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {
	public static void main(String[] args) {
		//1. 드라이브 로드
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con=null;
		PreparedStatement pstmt=null;
		
		//2.데이터베이스와 연결한다.
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc","kpc12","kpc1234");
			
			//3.SQL문 전송할 수 있는  PreparedStatement객체를 생성한다.
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM member1 ");
			sql.append("WHERE num = ?");
			
			pstmt= con.prepareStatement(sql.toString());
			
			//4.바인딩 변수 설정
			pstmt.setInt(1, 8);
			
			//5.SQL문 전송
			int resultCount = pstmt.executeUpdate();
			System.out.println("삭제된 행의 수: "+resultCount);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {			
			//6.모든 자원을 반납.
			try {
					if(con!=null) con.close();
					if(pstmt!=null) pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		}
	}

}
