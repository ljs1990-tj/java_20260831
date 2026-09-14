package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _1_db연결 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String db_url = "jdbc:oracle:thin:@db.ccxwnfpmkcwn.ap-northeast-2.rds.amazonaws.com:1521:orcl";
			String db_id = "admin"; // SYSTEM
			String db_pw = "test12#$%"; // test12#$
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		    stmt = conn.createStatement();
			System.out.println("DB 연결 완료");
			
			ResultSet rs =  stmt.executeQuery("SELECT * FROM FRUIT");
			while(rs.next()) {
				String name = rs.getString("FRUIT_NAME");
				System.out.println("과일명 : " + name);
				System.out.println("가격 : " + rs.getInt("PRICE"));
				System.out.println("===============");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}

}
