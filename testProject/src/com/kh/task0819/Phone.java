package com.kh.task0819;

public interface Phone {
	char[] NUMBERPAD = new char[12];
	NUMBERPAD = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '*', '0', '#'};

	String makeCall();
	String takeCall();
}
