package com.societegeneral.app.empRegPortal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements  Comparable<Employee> {

	private long id;
	private String firstName;
	private String lastName;
	private String department;
	private String gender;
	private String dateofbirth;
	
	public Employee() {
		
	}
	
	 @Override
	    public int compareTo(Employee o)
	    {
	        return this.getFirstName().compareTo( o.getFirstName() );
	    }
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "Department", nullable = false)
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String dept) {
		this.department = dept;
	}
	
	@Column(name = "Gender", nullable = false)
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Column(name = "DateOfBirth", nullable = false)
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	
	
}
