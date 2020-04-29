package com.servicenow.practice;

public class StaticBlock {

	private int b;
	StaticBlock()
	{
		System.out.println("Constructor ");
	}
	static{
		System.out.println("Static ");
	}
	
	{
		System.out.println("Init ");
	}
	
}

