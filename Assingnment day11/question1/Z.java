package com.masai.question1;

public interface Z extends X,Y{
	
	void abstractZ();
	
	default void defaultX() {
		System.out.println(" default X of Z interface");

	}

}