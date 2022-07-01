package org.system.assignment2;

public class Student extends College {

	
	public void studentName(){
		System.out.println("student name is :lalitha");	
	
	}
	public void studentDepartment(){
		System.out.println("The name of the department is :COMPUTER SCIENCE ");
	
	}
	public void studentId(){

       System.out.println("student id =14812");
	
	}


public static void main(String[] args) {
	Student obj = new Student(); 
	Department d=new Department();
	College c =new College();

	c.collegeName();
	c.collegeCode();
	c.collegeRank();
	d.departmentName();
	obj.studentName();
	obj.studentDepartment();
	obj.studentId();
	
}}

	


