package com.git.bean;

public class TestProgram {

	// instance variables
	private Integer testId;
	private String testName;

	// Default constructor
	public TestProgram() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterised constructor
	public TestProgram(Integer testId, String testName) {
		super();
		this.testId = testId;
		this.testName = testName;
	}

	// getters and setters
	public Integer getTestId() {
		return testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	// toString method
	public String toString() {
		return "TestProgram [testId=" + testId + ", testName=" + testName + "]";
	}

}
