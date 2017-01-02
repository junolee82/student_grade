package kr.or.dgit.student.dto;

public class Grade {
	// studNo, studKor, studEng, studMath;
	private Student student;
	private int studKor;
	private int studEng;
	private int studMath;

	public Grade() {
		super();
	}

	public Grade(Student student, int studKor, int studEng, int studMath) {
		super();
		this.student = student;
		this.studKor = studKor;
		this.studEng = studEng;
		this.studMath = studMath;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getStudKor() {
		return studKor;
	}

	public void setStudKor(int studKor) {
		this.studKor = studKor;
	}

	public int getStudEng() {
		return studEng;
	}

	public void setStudEng(int studEng) {
		this.studEng = studEng;
	}

	public int getStudMath() {
		return studMath;
	}

	public void setStudMath(int studMath) {
		this.studMath = studMath;
	}

	@Override
	public String toString() {
		return String.format("Grade [%s, %s, %s, %s]", student, studKor, studEng, studMath);
	}

}
