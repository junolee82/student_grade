package kr.or.dgit.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.or.dgit.student.dto.Grade;
import kr.or.dgit.student.util.DBConnection;
import kr.or.dgit.student.util.JdbcUtil;

public class GradeDao {
	private static final GradeDao instance = new GradeDao();
	private PreparedStatement pstmt;
	private ResultSet rs;

	private GradeDao() {
	}

	public static GradeDao getInstance() {
		return instance;
	}

	public int insertGrade(Grade grade) {
		Connection con = DBConnection.getConnection();
		String query = "insert into grade(studNo, studKor, studEng, studMath) values(?, ?, ?, ?);";
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, grade.getStudent().getStudNo());
			pstmt.setInt(2, grade.getStudKor());
			pstmt.setInt(3, grade.getStudEng());
			pstmt.setInt(4, grade.getStudMath());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
		}
		return -1;
	}
	
	
}
