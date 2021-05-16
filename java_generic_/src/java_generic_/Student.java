package java_generic_;

public class Student {
	
private int[] marks;

public int[] getMarks() {
	return marks;
}

public void setMarks(int[] marks) {
	this.marks = marks;
}

public char[] getGrade() {
	return grade;
}

public void setGrade(char[] grade) {
	this.grade = grade;
}

private char grade[];

public Student(int m[]) {
	this.marks=m;
}

public void findGrade() {
	char[] grade1=new char[this.marks.length];
 	for(int i=0;i<this.marks.length;i++) {
		if(this.marks[i]<=100&&this.marks[i]>=92) {
			grade1[i]='E';
		}else if(this.marks[i]<=92&&this.marks[i]>=85) {
			grade1[i]='A';
		}else if(this.marks[i]<=85&&this.marks[i]>70) {
			grade1[i]='B';
		}else if(this.marks[i]<=70&&this.marks[i]>=65) {
			grade1[i]='C';
		}else if(this.marks[i]<65) {
			grade1[i]='D';
		}else {
			grade1[i]='D';
		}
	}
 	
 	this.setGrade(grade1);
}

}
