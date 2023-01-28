package org.system.assignment5;

public class Automation extends  MultipleLanguage implements Language,TestTool {
	

	@Override
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("this is Java method ");
	}

	@Override
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("this is selenium method ");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("this is ruby method ");
	}
public static void main(String[] args) {
		Automation auto = new Automation();
		auto.Java();
		auto.Selenium();
		auto.Python();
		auto.ruby();
	}
}
