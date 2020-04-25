package com.mastek.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBC_connection {
	public static final String URL = "jdbc:postgresql://localhost:5432/bankdb";
	public static final String USER = "postgres";
	public static final String PASSWORD = "root";
	public static final String DRIVER_NAME = "org.postgresql.Driver";

	public static Connection getConnection() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		final Class driver = Class.forName(DRIVER_NAME);
//		DriverManager.registerDriver((Driver)driver.newInstance());
		Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
		if (connection.isClosed()) {
			return null;
		}
		return connection;

	}


}
