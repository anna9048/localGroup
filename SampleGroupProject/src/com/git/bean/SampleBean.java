package com.git.bean;

public class SampleBean {

	private String name;
	private int number;
	
	//
	public SampleBean(String name, int number) {
		super();
		this.name = name;
		this.number = number;
		
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String toString() {
		return "SampleBean [name=" + name + ", number=" + number + "]";
	}
	
	
	
}
