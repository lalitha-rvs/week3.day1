package org.system.assignment2;

public class Student extends College { class Student inherits College class

	
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
	Student obj = new Student(); object for Student class 
	Department d=new Department();object for Department class
	College c =new College();        object for college class 

	c.collegeName();           //all the methods from student ,department ,college classes are called by objects
	c.collegeCode();
	c.collegeRank();
	d.departmentName();
	obj.studentName();
	obj.studentDepartment();
	obj.studentId();
	
}}

	


