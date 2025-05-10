package com.pk.learning;

public class PayrollAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PayrollSystem system=new PayrollSystem();
		
		system.addEmployee(new Employee(101,"Pratik",2013000,200000,150000.32));
		system.addEmployee(new Employee(103,"Shashi",2013000,100000,250000.32));
		system.addEmployee(new Employee(105,"Amar",2313000,200000,250000.32));
		system.addEmployee(new Employee(108,"Kartik",1313000,200000,150000.32));
		system.addEmployee(new Employee(102,"Ahan",59000,100000,50000.32));

		
		system.printSalary();
		
		system.filterHigherEarner(200000);
	}

}
