package java_generic_;

abstract class Student2{
	private String studentName;
	private int[] testScores;
	private String testResult;
	
	public Student2(String studentName) {
		this.setStudentName(studentName);
		testScores=new int[4];
	}
	
	abstract public void generateResult();

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int[] getTestScore() {
		return testScores;
	}

	public void setTestScore(int testNumber,int testScore) {
		this.testScores[testNumber]=testScore;
		
	}


	public String getTestResult() {
		return testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}
	
	
}

class UndergraduateStudent extends Student2{
	public UndergraduateStudent(String name) {
		super(name);
	}
	
	


	
	

	
	public void generateResult() {
		
		int[] arr=super.getTestScore();
		int sum=0;
		for(int y:arr) {
			sum+=y;
		}
		
		int avg=(sum/arr.length);
		
		if(avg>=60) {
			super.setTestResult("Pass");
		}else {
			super.setTestResult("Fail");
		}
		
	}
	
}

class GraduateStudent extends Student2{
	public GraduateStudent(String name) {
		super(name);
	}
	
	

	
	public void generateResult() {
		
		int[] arr=super.getTestScore();
		int sum=0;
		for(int y:arr) {
			sum+=y;
		}
		int avg=(sum/arr.length);
		
		if(avg>=70) {
			super.setTestResult("Pass");
		}else {
			super.setTestResult("Fail");
		}
		
	}
}


public class Abstract_Exercise {

	 public static void main(String[] args) {
	        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
	        undergraduateStudent.setTestScore(0, 70);
	        undergraduateStudent.setTestScore(1, 69);
	        undergraduateStudent.setTestScore(2, 71);
	        undergraduateStudent.setTestScore(3, 55);
	            
	        undergraduateStudent.generateResult();
	            
	        System.out.println("Student name: "+undergraduateStudent.getStudentName());
	        System.out.println("Result: "+undergraduateStudent.getTestResult());
	            
	        System.out.println();
	            
	        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
	        graduateStudent.setTestScore(0, 70);
	        graduateStudent.setTestScore(1, 69);
	        graduateStudent.setTestScore(2, 71);
	        graduateStudent.setTestScore(3, 55);
	            
	        graduateStudent.generateResult();
	            
	        System.out.println("Student name: "+graduateStudent.getStudentName());
	        System.out.println("Result : "+graduateStudent.getTestResult());


}
}