package com.halitonur.service;

import com.halitonur.dto.DtoEmployee;

public interface IEmployeeService {
	
      public DtoEmployee findEmployeeById(Long id);
}
