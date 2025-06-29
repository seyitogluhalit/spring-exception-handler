package com.halitonur.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.halitonur.controller.RestEmployeeController;
import com.halitonur.dto.DtoEmployee;
import com.halitonur.model.RootEntity;
import com.halitonur.service.impl.EmployeeServiceImpl;

@RestController
@RequestMapping("rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements RestEmployeeController{
	
	@Autowired
	private EmployeeServiceImpl employeeService;

	@GetMapping("/list/{id}")
	@Override
	public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(value = "id") Long id) {
		return ok(employeeService.findEmployeeById(id));
	}

}
