package com.halitonur.service.impl;

import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.halitonur.dto.DtoDepartment;
import com.halitonur.dto.DtoEmployee;
import com.halitonur.exception.BaseException;
import com.halitonur.exception.ErrorMessage;
import com.halitonur.exception.MessageType;
import com.halitonur.model.Department;
import com.halitonur.model.Employee;
import com.halitonur.repository.EmployeeRepository;
import com.halitonur.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public DtoEmployee findEmployeeById(Long id) {
		DtoEmployee dtoEmployee = new DtoEmployee();
		DtoDepartment dtoDepartment = new DtoDepartment();
	  Optional<Employee> optional = employeeRepository.findById(id);
	  if(optional.isEmpty()) {
		  throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST,id.toString()));
	  }
	  
	  Employee employee = optional.get();
	  Department department = employee.getDepartment();
	  BeanUtils.copyProperties(employee, dtoEmployee);
	  BeanUtils.copyProperties(department, dtoDepartment);
	  
	  dtoEmployee.setDepartment(dtoDepartment);
	  
		return dtoEmployee;
	}
       
}
