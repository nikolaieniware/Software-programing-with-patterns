package org.designpatterns.Composit;

public class CompositeDesignPatternMain {

	public static void main(String[] args) {
		  Служител emp1=new Разработчик("Маргарита", 15000);
		  Служител emp2=new Разработчик("Цветелин", 15000);
		  Служител emp3=new Разработчик("Николай", 10000);
		  Служител manager1=new Мениджър("Пламен",25000);
		  Служител emp4=new Разработчик("Новопостъпил", 20000);
		  Мениджър generalManager=new Мениджър("Марио", 50000);
		  manager1.add(emp1);
		  manager1.add(emp2);
		  generalManager.add(emp3);
		  generalManager.add(emp4);
		  generalManager.add(manager1);
		  generalManager.print();
		 }
		}
