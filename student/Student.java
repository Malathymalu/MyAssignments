package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student name is - "+"Malathy");

	}
	public void studentDept() {
		System.out.println("Student Department is - "+ "BCA");

	}
public void studentId() {
	System.out.println("Student ID is - "+ "547832");
}
	public static void main(String[] args) {
		Student st = new Student();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentId();
		st.studentDept();
	}

}
