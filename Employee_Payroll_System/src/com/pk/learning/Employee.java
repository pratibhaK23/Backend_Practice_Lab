package com.pk.learning;

public class Employee {
private int id;
private String name;
private double basicSalary;
private double hra;
private double deductions;



public Employee(int id, String name, double basicSalary, double hra, double deductions) {
	super();
	this.id = id;
	this.name = name;
	this.basicSalary = basicSalary;
	this.hra = hra;
	this.deductions = deductions;
}



@Override
public String toString() {
	return "Employee [name=" + name + ", basicSalary=" + basicSalary + "]";
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public double getBasicSalary() {
	return basicSalary;
}



public void setBasicSalary(double basicSalary) {
	this.basicSalary = basicSalary;
}



public double calculateSalary()
{
	return basicSalary+hra-deductions;
}

}
