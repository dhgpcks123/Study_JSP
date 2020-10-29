package day03.db;

import java.sql.*;

public class ClsJDBC {
	private String url="jdbc:oracle:thin:@localhost:1521:orcl";
	private String user="hello";
	private String pw="hello";

	public ClsJDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("### 드라이버 로딩 실패 ###");
			e.printStackTrace();
		}
	}
	
	public Connection getCon() {
		Connection con = null;
			try {
				con = DriverManager.getConnection(url, user, pw);
			}catch(Exception e) {
				System.out.println("### Connection get Fail ###");
				e.printStackTrace();
			}
		
		return con;
	}
	
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	public PreparedStatement getPSTMT(Connection con, String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	
	public void close(Object o) {
		try {
			if(o instanceof Connection) {
				((Connection)o).close();
			}else if(o instanceof Statement){
				((Statement)o).close();
			}else if(o instanceof PreparedStatement){
				((PreparedStatement)o).close();
			}else if(o instanceof ResultSet){
				((ResultSet)o).close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
