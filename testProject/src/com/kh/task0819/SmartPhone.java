package com.kh.task0819;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
	protected String maker;
	
	public SmartPhone() {
		
	}
	public SmartPhone(String maker) {
		this.maker = maker;
	}
	public String printInformation() {
		
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getMaker() {
		return this.maker;
	}
}
