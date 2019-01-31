package web20190111;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class JDBCExample1 {
	public static void main(String[] args) {			
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
			
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="student";
		String pw="1234";
			
		Connection connection = DriverManager.getConnection(url, user, pw);			
		System.out.println("데이터베이스 연결 성공");
		
		String sql = "insert into emp values (?,?,?,?,?,?,?,?);";
	    PreparedStatement pstmt = connection.prepareStatement(sql);
	    pstmt.setString(1,"1111");
	    pstmt.setString(2,"aaaa");
	    pstmt.setString(3,"bbbb");
	    pstmt.setString(4,"2222");
	    pstmt.setString(5,"");
	    pstmt.setString(6,"");
	    pstmt.setString(7,"");
	    pstmt.setString(8,"");

	    pstmt.executeUpdate();
	    

	    pstmt.close();
			
		connection.close();
		} catch(ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾지 못했습니다.");

		} catch (SQLException e) {
			System.out.println("데이터베이스 연결에 실패하였습니다.");

		}
		
		 

		

	}

}
