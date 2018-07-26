package org.designpatterns.Composit;

public  class Разработчик implements Служител {
	private String name;
	  private double Заплата;

	  public Разработчик(String name,double Заплата){
	    this.name = name;
	    this.Заплата = Заплата;
	  }
	  public void add(Служител employee) {
	    //this is leaf node so this method is not applicable to this class.
	  }

	  public Служител getChild(int i) {
	    //this is leaf node so this method is not applicable to this class.
	    return null;
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
	  }

	  public void remove(Служител employee) {
	    //this is leaf node so this method is not applicable to this class.
	  }

	}
