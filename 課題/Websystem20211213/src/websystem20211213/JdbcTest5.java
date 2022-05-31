/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package websystem20211213;

/**
 *
 * @author doanh
 */
import java.net.*;
import java.sql.*;

public class JdbcTest5 {
  public static void main( String args[] ) throws Exception {
    String servername     = "localhost"; 
    // // 接続先サーバー名は，第１引数として与える。
    String urlprefix      = "jdbc:mysql://";
    //    String databasename   = "mysql";
    String databasename   = "websystem";
    String user           = "root";

    //	StringBuffer temp = null;
    //  if(args.length == 2) temp = new StringBuffer( args[1] ); else temp = new StringBuffer( "" );
    //	String password = temp.toString(); 
    String password = "lanchi0209"; 
    // String serverencoding = "EUC_JP";
    String serverencoding = "UTF-8";
  
    String url =  urlprefix + servername + "/" + databasename + "?useUnicode=true&characterEncoding=" + serverencoding;
  
    Connection con = null;
    try {
      Class.forName( "com.mysql.jdbc.Driver" );               
      // Loading Driver
      con = DriverManager.getConnection( url, user, password ); 
      // Connecting MySQL server
      System.out.println( "Connected...." );
      Statement st = con.createStatement();
      String sqlStr = "SELECT * FROM fruit";
      ResultSet result = st.executeQuery( sqlStr );
    
      while( result.next() ) {
        String str1 = result.getString( "no" );
        String str2 = result.getString( "name" );
        String str3 = result.getString( "price" );
        System.out.println( str1 + ", " + str2 + ", " + str3);
      }
    
      result.close();
      st.close();
      con.close();
    }
    catch( SQLException e ) {
      System.out.println( "Connection Failed. : " + e.toString() );
      throw new Exception();
    }
    catch( Exception e ) {
      System.out.println( "Exception! :" + e.toString() );  
      throw new Exception();
    }
    finally {
      try {
        if ( con != null ) con.close();
      }
      catch(Exception e){
        System.out.println( "Exception! :" + e.toString() );
        throw new Exception();
      }
    }
  }
}