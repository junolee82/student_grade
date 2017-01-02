package kr.or.dgit.student.test;

import java.sql.Connection;

import kr.or.dgit.student.util.DBConnection;

public class TestMain {
	public static void main(String[] args) {
		Connection con = DBConnection.getConnection();
		
	}
}
