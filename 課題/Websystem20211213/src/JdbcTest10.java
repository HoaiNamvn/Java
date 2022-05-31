/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doanh
 */
import java.sql.*;

public class JdbcTest10 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/websystem";	
			String user = "root";
			String password = "lanchi0209";

			Connection conn = DriverManager.getConnection(url, user, password);
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT color, COUNT(*) AS count FROM color GROUP BY color");
			
			while ( rs.next() ) {
				String color = rs.getString("color");
				int count = rs.getInt("count");
				System.out.println(color + " : " + count);
			}
			
			rs.close();
			stmt.close();
			conn.close();
		} catch ( SQLException e ) {
			e.printStackTrace();
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
}