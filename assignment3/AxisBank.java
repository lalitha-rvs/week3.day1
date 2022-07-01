package org.system.assignment3;

 public class  AxisBank extends BankInfo {
	void savings() {
	}
	 public void fixed() {
	}
	
	 public void deposit() {
		System.out.println("minimum deposit is 10,000");
	}
	 public static void main(String[] args) {
			BankInfo bI=new BankInfo();
			AxisBank ab=new AxisBank();
		 
		 bI.deposit();
		 ab.deposit();
		 
}}
