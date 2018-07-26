package org.designpatterns.Composit;

public  class Developer implements Employee {
	private String name;
	  private double Salary;

	  public Developer(String name,double Salary){
	    this.name = name;
	    this.Salary = Salary;
	  }
	  public void add(Employee employee) {
	    //this is leaf node so this method is not applicable to this class.
	  }

	  public Employee getChild(int i) {
	    //this is leaf node so this method is not applicable to this class.
	    return null;
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
	  }

	  public void remove(Employee employee) {
	    //this is leaf node so this method is not applicable to this class.
	  }

	}
