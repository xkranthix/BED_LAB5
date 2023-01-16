package com.greatlearning.employeemgnt.service;

import java.util.List;

import com.greatlearning.employeemgnt.model.employee;

public interface EmployeeService {

	public List<employee> getAllemployees();
	public void saveOrUpdate(employee emp);
	public void deleteEmployeeById(int id);
	public employee getEmployeeById(int id);
		
		
}
