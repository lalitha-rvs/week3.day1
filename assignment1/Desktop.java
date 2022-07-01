package org.system.assignment1;

public class Desktop extends Computer{    // class Desktop  inherits class Computer 
	public void deskTopSize() {
		int size=14;
	
		System.out.println("desktop size is "+size);}
	
public static void main(String[] args) {
	Desktop obj=new Desktop();//creating an object of class Desktop 
	obj.ComputerModel();       //call to method in computer class
	obj.deskTopSize();         //call to method in Desktop class
}
}
