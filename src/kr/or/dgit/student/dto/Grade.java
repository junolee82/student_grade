package kr.or.dgit.student.dto;

public class Grade {
	// studNo, studKor, studEng, studMath;
	private int studNo;
	private int studKor;
	private int studEng;
	private int studMath;

	public Grade() {
		super();
	}

	public Grade(int studNo, int studKor, int studEng, int studMath) {
		super();
		this.studNo = studNo;
		this.studKor = studKor;
		this.studEng = studEng;
		this.studMath = studMath;
	}

	public int getStudNo() {
		return studNo;
	}

	public void setStudNo(int studNo) {
		this.studNo = studNo;
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
		return String.format("Grade [%s, %s, %s, %s]", studNo, studKor, studEng, studMath);
	}

}
