package java_generic_;



class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	
	public Employee(int employeeId,String employeeName) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}

class ContractEmployee extends Employee{
	private double wage;
	private float hoursWorked;
	
	
	public ContractEmployee(int empId,String Name,double wage,float hoursWorked){
		super(empId,Name);
		this.wage=wage;
		this.hoursWorked=hoursWorked;
		
	}
	
	
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public float getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	

	
	public void calculateSalary() {
		this.setSalary(this.getWage()*this.getHoursWorked());
	}
	
}

class PermanentEmployee extends Employee{
	private double basicPay;
	private double hra;
	private float experience;
	
	
	public PermanentEmployee(int empId,String Name,double basicPay,double hra,float experience){
		super(empId,Name);
		this.basicPay=basicPay;
		this.hra=hra;
		this.experience=experience;
		
	}
	
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	
	public void calculateSalary() {
		double vc=0;
		
		if(this.getExperience()<3) {
			vc=0;
		}else if(this.getExperience()>=3&&this.getExperience()<5) {
			vc=5;
		}else if(this.getExperience()>=5&&this.getExperience()<10) {
			vc=7;
		}else if(this.getExperience()>=10) {
			vc=12;
		}
		
		double finSal=this.getBasicPay()+this.getHra()+vc;
		this.setSalary(finSal);
	}
}



