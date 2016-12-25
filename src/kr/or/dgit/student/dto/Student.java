package kr.or.dgit.student.dto;

public class Student {
	private int studNo;
	private String studName;

	public Student() {
		super();
	}

	public Student(int studNo) {
		super();
		this.studNo = studNo;
	}

	public Student(int studNo, String studName) {
		super();
		this.studNo = studNo;
		this.studName = studName;
	}

	public int getStudNo() {
		return studNo;
	}

	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	@Override
	public String toString() {
		return "Student [studNo=" + studNo + ", studName=" + studName + "]";
	}

}
