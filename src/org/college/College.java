package org.college;

public class College extends Student {
	public void collegeName() {
		System.out.println("college Name");
	}
	public void collegeCode() {
		System.out.println("college code");
	}
	public void collegeRank() {
		System.out.println("college rank");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College c = new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		
		c.studentName();
		c.studentDept();
		c.studentId();
		c.hostelName();
		c.deptName();
		

	}

}
