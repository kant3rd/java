package com.ravikant;

public class java1 {
	
	
	
	
	//main method
	public static void main(String[] args) {

		System.out.println("java first programm");
		// creating object
		java1 programm = new java1();
		// refrence calling
		programm.message();
		// direct calling no need to create object
		staticmessage();
		programm.mydetails();

	}

	// public method
	public void message() {
		System.out.println("m a student of mechanical engg");
	}

	public static void staticmessage() {

		System.out.println("staticmessage");

	}

	public void mydetails() {

		String name ="Ravikant";
		int age = 25;
		System.out.println("my details are");

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

}
