package com._TheymeLeaf_Pract1.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Staff {

	@Id
	@Column(name = "EMPLOYEE_ID")
	private String employeeId;
	
	@Column(name = "FIRST_NAME")
	private String firsName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "POSITION")
	@Enumerated(EnumType.STRING)
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
