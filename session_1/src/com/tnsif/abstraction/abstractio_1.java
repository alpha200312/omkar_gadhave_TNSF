package com.tnsif.abstraction;

import java.util.Scanner;



abstract public class abstractio_1 {
	 String name;
	  
	 public abstractio_1(String n) { 
		this.name=n;
	}
	 String getname() {return name;};
	 
	 

}
  class first extends abstractio_1 {
	  String surname;
	  public first(String name,String surname) {
		  super(name);
		  this.surname=surname;
		
	}
	  public static void main(String []args) {
		  Scanner sc=new Scanner(System.in);
		  String name=sc.nextLine();
		  String surname=sc.nextLine();
		  first obj=new first(name,surname);
		  System.out.print(obj.getname());
		  
	  }
	 
 }