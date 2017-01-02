package kr.or.dgit.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.or.dgit.student.dto.Student;
import kr.or.dgit.student.util.DBConnection;
import kr.or.dgit.student.util.JdbcUtil;

public class StudentDao {
	private static final StudentDao instance = new StudentDao();
	private PreparedStatement pstmt;
	private ResultSet rs;

	private StudentDao() {
	}

	public static StudentDao getInstance() {
		return instance;
	}

	public Student selectStudentNamebyNo(int studNo) {
		Connection con = DBConnection.getConnection();
		String query = "select studNo, studName from student where studNo = ?";
		Student student = null;
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, studNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				student = new Student(rs.getInt("studNo"), rs.getString("studName"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		return student;
	}
}
