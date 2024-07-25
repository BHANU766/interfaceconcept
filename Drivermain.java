package com.interfaceconcept;

public class Drivermain {

	public static void main(String[] args) {
		Saving sa=new Saving();
		sa.deposit();
		sa.checkbalance();
		sa.withdraw();
		
		Current ca=new Current();
		ca.deposit();
		ca.checkbalance();
		ca.withdraw();
		

	}

}
