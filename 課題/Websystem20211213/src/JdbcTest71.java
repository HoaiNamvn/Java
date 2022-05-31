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

public class JdbcTest71 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// test table acess
			String url = "jdbc:mysql://localhost/websystem";	
			String user = "root";
			String password = "lanchi0209";
			Connection conn = DriverManager.getConnection(url, user, password);
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT name, price FROM fruit1 WHERE price < 100");
			
			while (rs.next()) {
				String name = rs.getString("name");
				int price = rs.getInt("price");
				System.out.println(name + " : " + price);
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
