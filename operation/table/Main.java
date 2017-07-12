package com.ravikant.operation.table;

public class Main {

	
	public static void main(String[] args) {
		
		Table table = new Table();
		
		System.out.println("Tab Method: ");
		table.tab(199, 3);
		
		System.out.println("Tab int return method: ");
		System.out.println(table.tabint(24, 67));
		
		System.out.println("Table :");
		new Table(14, 5);
	}
}
