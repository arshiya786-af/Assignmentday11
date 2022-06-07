package com.masai.question1;

public interface Y {
	
	void abstractY();
	
	default void defaultY() {
		System.out.println("default  Y interface");
	}
	
	static void staticY() {
		System.out.println(" static Y interface");

	}
}