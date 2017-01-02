package kr.or.dgit.student.test;

import java.sql.Connection;

import javax.swing.JOptionPane;

import kr.or.dgit.student.dao.GradeDao;
import kr.or.dgit.student.dto.Grade;
import kr.or.dgit.student.dto.Student;
import kr.or.dgit.student.util.DBConnection;

public class TestMain {
	public static void main(String[] args) {
		Connection con = DBConnection.getConnection();

		Grade grade = new Grade(new Student(400), 100, 45, 60);
		int res = GradeDao.getInstance().insertGrade(grade);
		if (res == 1)
			JOptionPane.showMessageDialog(null, "»ðÀÔ ¼º°ø");
		else
			JOptionPane.showMessageDialog(null, "»ðÀÔ ½ÇÆÐ");

		/* GradeDao.getInstance().deleteAllGrade(); */
	}
}
