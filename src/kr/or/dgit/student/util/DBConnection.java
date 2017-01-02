package kr.or.dgit.student.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static DBConnection instance = new DBConnection();
	private static Connection con;

	private DBConnection() {
		try {
			Class.forName(Config.DRIVER);
			con = DriverManager.getConnection(Config.URL, Config.USER, Config.PASSWORD);
			System.out.println("DB Connection success");
		} catch (ClassNotFoundException e) {
			System.err.println("Jdbc Driver ���");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("�ּ� Ȥ�� ���� ��й�ȣ Ȯ��");
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		if (instance == null) {
			new DBConnection();
		}
		return DBConnection.con;
	}

	public static void closeConnection() {
		if (con != null) {
			try {
				con.close();
				con = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
