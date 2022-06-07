package com.masai.question1;

public interface X {
	
	void abstractX();
	
	default void defaultX() {
		System.out.println(" default  X interface");

	}
	
	static void staticX() {
		System.out.println(" static X  interface");

	}
}