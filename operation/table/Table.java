package com.ravikant.operation.table;

public class Table {
	

	public Table(int num, int range) {
	
	for(int i =1; i <=range;i++)
	System.out.println(num + " * " + i + " = " + num*i);
	}



  public Table() {
	  
  }
  
  public void tab(int num1, int num2) {
	   System.out.println(num1 * num2);
  }
  
  public int tabint(int num1, int num2) {
	   return (num1 * num2);
 }
  
}