package java_generic_;

//array assingment 1

public class Teacher {
	
	private String teacherName;
	private String subject;
	private double salary;
	
	public Teacher(String teacherName,String subject,double salary) {
		this.teacherName=teacherName;
		this.subject=subject;
		this.salary=salary;
		
	}
	
	public String getTeacherName() {
		return this.teacherName;
		
	}
	
	public void setTeacherName(String name) {
		this.teacherName=name;
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	public void setSubject(String sub) {
		this.subject=sub;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setSalary(double sal) {
		this.salary=sal;
	}

}
