package com._TheymeLeaf_Pract1.Model;

public class Staff {

	private String employeeId;
	private String firsName;
	private String lastName;
	private Position position;

	public Staff() {

	}

	public Staff(String employeeId, String firsName, String lastName, Position position) {

		this.employeeId = employeeId;
		this.firsName = firsName;
		this.lastName = lastName;
		this.position = position;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

}
