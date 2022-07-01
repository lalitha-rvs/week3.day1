package org.system.assignment4;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("student id is : "+id);
		

	}
	public void getStudentinfo(int id,String name) {
	System.out.println("student id is : "+id+ " and Name of the student  is: "+name);
		
	}
		
		public void gtStrudentinfo(String  phoneNumber,String emailid ) {
			System.out.println("Student phoneNumber  : "+phoneNumber+ " and Email Id  of the student  is: "+emailid);
			
	}


public static void main(String[] args) {
	Students get=new Students();
	get.getStudentInfo(14812);
	get.getStudentinfo(12356, "lalitha");
	get.gtStrudentinfo("9640549785", "lalitha.a5@gmail.com");
   System.out.println("*************************************************************************************************************");
	Students getAgain=new Students();
	getAgain.getStudentInfo(21841);
	getAgain.getStudentinfo(654321, "Testleaf");
	getAgain.gtStrudentinfo("5879450469", "lalitha.a9@gmail.com");
	

}   


}