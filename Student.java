package studentManagment;

public class Student {
	private int studentId;
	private String StudentName;
	private String StudentMobile;
	private String StudentCity;

	public Student(int studentId, String studentName, String studentMobile, String studentCity) {
		super();
		this.studentId = studentId;
		StudentName = studentName;
		StudentMobile = studentMobile;
		StudentCity = studentCity;
	}

	public Student(String studentName, String studentMobile, String studentCity) {
		super();
		StudentName = studentName;
		StudentMobile = studentMobile;
		StudentCity = studentCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentMobile() {
		return StudentMobile;
	}

	public void setStudentMobile(String studentMobile) {
		StudentMobile = studentMobile;
	}

	public String getStudentCity() {
		return StudentCity;
	}

	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", StudentName=" + StudentName + ", StudentMobile=" + StudentMobile
				+ ", StudentCity=" + StudentCity + "]";
	}

}
