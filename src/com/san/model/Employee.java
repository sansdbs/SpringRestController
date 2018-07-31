package com.san.model;

import java.util.ArrayList;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.san.validation.IsValidCity;

@JsonInclude(JsonInclude.Include.NON_NULL)//to remove the properties who's having null
//@JsonIgnoreProperties({"empId","empAddress"})//this ignore properties
@JsonPropertyOrder({"empId","empName","empMobile","empAddress","empCity"})
public class Employee {

	
	//@JsonProperty("emp_ID")//using this annotation we can change the property name
	private int empId;
	// @Size(min =2, max =20, message ="Please enter Employee Name field between
	// {min} to {max} characters")
	private String empName;
	@IsValidCity @Size(min = 2, max = 30)
	private String empCity;
	private Long empMobile;
	private ArrayList<String> empHobby;
	private Address empAddress;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public Long getEmpMobile() {
		return empMobile;
	}

	public void setEmpMobile(Long empMobile) {
		this.empMobile = empMobile;
	}

	public ArrayList<String> getEmpHobby() {
		return empHobby;
	}

	public void setEmpHobby(ArrayList<String> empHobby) {
		this.empHobby = empHobby;

	}

	public Address getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}

}
