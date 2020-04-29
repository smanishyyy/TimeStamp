package com.servicenow.practice;

public final class Employee {
	final String pancardNumber;  
	  
	public Employee(String pancardNumber){  
	this.pancardNumber=pancardNumber;  
	}  
	  
	public Employee() {
		this("10");
	}

	public String getPancardNumber(){  
	return pancardNumber;  
	}  
		 
		  
}

