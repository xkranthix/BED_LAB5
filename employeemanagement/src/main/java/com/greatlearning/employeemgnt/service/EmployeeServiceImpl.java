package com.greatlearning.employeemgnt.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemgnt.model.employee;
import com.greatlearning.employeemgnt.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository repository;
	
	@Override
	public List<employee> getAllemployees() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void saveOrUpdate(employee emp) {
		// TODO Auto-generated method stub
		repository.save(emp);
		
	}

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		
		return repository.findById(id).get();
	}

}
