package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBClass {
	private Connection conn;
	private Statement stmt = null;
	
	public Statement getStmt() {
		return stmt;
	}
	
	public DBClass() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SYSTEM"; // SYSTEM
			String db_pw = "test12#$"; // test12#$
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		    stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("에러 발생!!");
		}
	}
	
}
