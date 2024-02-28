package kr.or.ddit.study06.sec05.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	private static Connection conn=null;
	
	public static Connection getConection() {
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
									//로컬(ip) //포트번호
		String user="pc04";
		String pass="java";
		
		if(conn==null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, pass);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
}
