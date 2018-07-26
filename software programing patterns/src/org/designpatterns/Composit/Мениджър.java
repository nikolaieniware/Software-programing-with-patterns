package org.designpatterns.Composit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Мениджър implements Служител {
	private String name;
	 private double Заплата;

	 public Мениджър(String name,double Заплата){
	  this.name = name;
	  this.Заплата = Заплата;
	 }

	 List<Служител> employees = new ArrayList<Служител>();
	 public void add(Служител employee) {
	    employees.add(employee);
	 }

	 public Служител getChild(int i) {
	  return employees.get(i);
	 }

	 public String getName() {
	  return name;
	 }

	 public double getЗаплата() {
	  return Заплата;
	 }

	 public void print() {
	  System.out.println("-------------");
	  System.out.println("Цените са в Български лева");
	  System.out.println("Име ="+getName());
	  System.out.println("Заплата ="+getЗаплата());
	  System.out.println("-------------");

	  Iterator<Служител> employeeIterator = employees.iterator();
	    while(employeeIterator.hasNext()){
	     Служител employee = employeeIterator.next();
	     employee.print();
	    }
	 }

	 public void remove(Служител employee) {
	  employees.remove(employee);
	 }

	}

