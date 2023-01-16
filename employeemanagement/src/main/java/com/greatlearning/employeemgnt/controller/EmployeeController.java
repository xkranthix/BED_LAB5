package com.greatlearning.employeemgnt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.greatlearning.employeemgnt.model.employee;
import com.greatlearning.employeemgnt.service.EmployeeService;

import antlr.collections.List;
@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employee")
		public String getAllEmployess(Model model)
		{
		List<employee> results = service.getAllemployees();
		model.addAttribute("employess", results);
		return "employess";
		
		}
	@GetMapping("/employee/new")
	public String getNewEmployess1(Model model)
	{
		employee result = new employee();
		model.addAttribute("employee", result);
	return "employee";
	
	}
	
	@GetMapping("/employee/edit/{id}")
	public String getNewEmployess(Model model, @PathVariable("id") int id)
	{
		employee result = service.getEmployeeById(id);
		model.addAttribute("employe", result);
	return "edit_employess";
	}
	
	@GetMapping("/employee/delete/{id}")
	public String deleteEmployee1(@PathVariable("id") int id)
	{
		service.deleteEmployeeById(id);
		
			return "redirct:/employee";
}

	@PostMapping("/employee")
	public String saveNewEmployee(@ModelAttribute("employee") employee emp) {
		service.saveOrUpdate(emp);
			return "redirct:/employee";
}
@PostMapping("/employee/{id}")
public String updateEmployee(@ModelAttribute("employee") employee emp, @PathVariable("id") int id) {
	employee exsistingEmployee = service.getEmployeeById(id);
	exsistingEmployee.setFirstName(emp.);
	exsistingEmployee.setLastName(emp.getLastName());
	exsistingEmployee.setFirstName(emp.getEmail());
	service.saveOrUpdate(exsistingEmployee);
		return "redirct:/employee";
}
}

