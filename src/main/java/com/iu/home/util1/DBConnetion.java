package com.iu.home.util1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnetion {
	public static Connection getConnection() throws Exception {
		//Product쪽 컨넥트
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
	
	
	

}
