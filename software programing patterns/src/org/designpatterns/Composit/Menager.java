package org.designpatterns.Composit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menager implements Employee {
	private String name;
	 private double Salary;

	 public Menager(String name,double Salary){
	  this.name = name;
	  this.Salary = Salary;
	 }

	 List<Employee> employees = new ArrayList<Employee>();
	 public void add(Employee employee) {
	    employees.add(employee);
	 }

	 public Employee getChild(int i) {
	  return employees.get(i);
	 }

	 public String getName() {
	  return name;
	 }

	 public double getSalary() {
	  return Salary;
	 }

	 public void print() {
	  System.out.println("-------------");
	  System.out.println("The salary are in Bulgarian Leva");
	  System.out.println("Име ="+getName());
	  System.out.println("Заплата ="+getSalary());
	  System.out.println("-------------");

	  Iterator<Employee> employeeIterator = employees.iterator();
	    while(employeeIterator.hasNext()){
	     Employee employee = employeeIterator.next();
	     employee.print();
	    }
	 }

	 public void remove(Employee employee) {
	  employees.remove(employee);
	 }

	}

