package controller;

import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	@SuppressWarnings("static-access")
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
	// Fill your code
		ConnectionManager cm = new ConnectionManager();
		Connection con = null;
		con = cm.getConnection();
		
		if(con!= null)
			System.out.println("Connection Established");
		else
			System.out.println("Check your connection");
		
	}
}
