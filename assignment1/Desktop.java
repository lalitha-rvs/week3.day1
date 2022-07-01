package org.system.assignment1;

public class Desktop extends Computer{
	public void deskTopSize() {
		int size=14;
	
		System.out.println("desktop size is "+size);}
	
public static void main(String[] args) {
	Desktop obj=new Desktop();
	obj.ComputerModel();
	obj.deskTopSize();
}
}
