package com.iu.home.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	public static Connection getConnection() throws Exception {
		
		//getConnection
		//1.연결 정보
		String user="user01";
		String password="user01";
		String ur1="jdbc:oracle:thin:@localhost:1521:xe";
		String driver="oracle.jdbc.driver.OracleDriver";
		
		//2. Driver를 메모리에 로딩
		Class.forName(driver);
		
		//3. DB 연결
		return DriverManager.getConnection(ur1, user, password);
	}
	
	
public static void disConnection( PreparedStatement st,Connection connection) throws Exception {
		
		st.close();
		connection.close();
	}

	public static void disConnection(ResultSet rs, PreparedStatement st,Connection connection) throws Exception {
		rs.close();
		st.close();
		connection.close();
	}
	
	   
	public static void main(String[] args) {
			try {
				Connection con = DBConnection.getConnection();
				System.out.println(con != null);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
	
	
	
	
