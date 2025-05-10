package com.pk.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class PayrollSystem {

	List<Employee> employee=new ArrayList<>();
	
	public void addEmployee(Employee e)
	{
		employee.add(e);
	}
	
	public void printSalary()
	{
		Iterator itr=employee.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	
	public void filterHigherEarner(double threshold)
	{
		List<Employee> filtered=employee.stream().filter(e->e.calculateSalary()>threshold).collect(Collectors.toList());
		
		for(Employee emp:filtered)
		{
			System.out.println(emp);
		}
	}
}
