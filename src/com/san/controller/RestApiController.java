package com.san.controller;

import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.san.model.Employee;

@RestController
public class RestApiController {

	// Restful web services
	@RequestMapping(value = "/employee", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Employee> getEmployeeList() {

		Employee employee1 = new Employee();
		employee1.setEmpId(100);

		Employee employee2 = new Employee();
		employee2.setEmpName("Mr.Robert");

		Employee employee3 = new Employee();
		employee3.setEmpCity("New Jercey");

		ArrayList<Employee> empList = new ArrayList<>();

		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		return empList;

	}

	// ****************Retrieving Employee record***********************

	@RequestMapping(value = "/employee/{empName}", method = RequestMethod.GET)
	public Employee getRecords(@PathVariable("empName") String empName) {
		Employee employee = new Employee();
		employee.setEmpId(101);
		employee.setEmpName(empName);
		employee.setEmpCity("california");
		return employee;

	}

	// ******************Updating the Employee record********************

	@RequestMapping(value = "/employee/{empCity}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> updateEmployee(@PathVariable("empCity") String empCity,
			@RequestBody Employee employee) {
		System.out.println("Employee City =" + empCity);
		System.out.println("Employee City =" + employee.getEmpCity() + ", Employee Name =" + employee.getEmpName());
		// find the matching record using "empCity" from the database
		// update the employee matching record with the information of employee sent by
		// the client
		// return true if update is successful otherwise return false

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("key1", "value1");
		httpHeaders.add("key2", "value2");

		return new ResponseEntity<Boolean>(true, httpHeaders, HttpStatus.OK);

	}

	// creating new resource with POST method
	@RequestMapping(value = "/employee", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> postEmployee(@RequestBody Employee employee) {

		System.out.println("Employee Name =" + employee.getEmpName() + " ,Employee City =" + employee.getEmpCity());
		// insert the student record into the database

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Location", ServletUriComponentsBuilder.fromCurrentRequest().path("/{empName}")
				.buildAndExpand(employee.getEmpName()).toUri().toString());

		return new ResponseEntity<Boolean>(true, httpHeaders, HttpStatus.CREATED);

	}

	// deleting employee record

	@RequestMapping(value = "/employee/{empName}", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteEmployeeDetail(@PathVariable("empName") String empName) {

		System.out.println("Employee Name :" + empName);

		return new ResponseEntity<Boolean>(true, HttpStatus.OK);

	}

	// deleting all employee records

	@RequestMapping(value = "/employee", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteEmployeeDetail() {

		// deleting all employee records
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);

	}

}
