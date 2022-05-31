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

public class JdbcTest63 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/websystem";
			String user = "root";
			String password = "lanchi0209";
			Connection conn = DriverManager.getConnection(url, user, password);
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM customers_tbl");
			
			while (rs.next()) {
				String customername = rs.getString("customername");
                                String customeraddress = rs.getString("customeraddress");
                                String customerphone = rs.getString("customerphone");
				int customerid = rs.getInt("customerid");
				System.out.println(customerid + " : " + customername + customeraddress + " : " + customerphone);
			}
	
			rs.close();
			stmt.close();
			conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}