package com.greatlearning.employeemgnt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeemgnt.model.employee;

public interface EmployeeRepository extends JpaRepository<employee,Integer> {

}
