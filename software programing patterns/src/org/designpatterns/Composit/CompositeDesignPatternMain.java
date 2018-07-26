package org.designpatterns.Composit;

public class CompositeDesignPatternMain {

	public static void main(String[] args) {
		  Employee emp1=new Developer("Margarita", 15000);
		  Employee emp2=new Developer("Tsvetelin", 15000);
		  Employee emp3=new Developer("Nikolai", 10000);
		  Employee manager1=new Menager("Plamen",25000);
		  Employee emp4=new Developer("The new guy", 20000);
		  Menager generalManager=new Menager("Mario", 50000);
		  manager1.add(emp1);
		  manager1.add(emp2);
		  generalManager.add(emp3);
		  generalManager.add(emp4);
		  generalManager.add(manager1);
		  generalManager.print();
		 }
		}
