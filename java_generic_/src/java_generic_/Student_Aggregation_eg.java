package java_generic_;

class Subject {
	private String subjectName;

	Subject(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public String getSubjectName(){
	    return this.subjectName;
	}
	
	public void setSubjectName(String subjectName){
	    this.subjectName=subjectName;
	}
}

class Student_Aggregation_eg {
	private int rollNo;
	private String studentName;
	private Subject subject;

	Student_Aggregation_eg(int rollNo, String studentName, Subject subject) {
		this.rollNo = rollNo;
		this.studentName = studentName;
	//	subject.setSubjectName(subject);
	this.subject=subject;
	}
	
	public String getStudentName(){
	    return this.studentName;
	}

	public void displayDetails() {
		System.out.println("Student Name: " + getStudentName());
		System.out.println("Subject Name: " + subject.getSubjectName());



	}

	public static void main(String args[]) {
		Subject subject = new Subject("Maths");
		Student_Aggregation_eg student = new Student_Aggregation_eg(101, "Nate", subject);
		student.displayDetails();
	}
}
