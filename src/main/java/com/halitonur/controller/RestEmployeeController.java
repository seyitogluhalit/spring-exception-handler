package com.halitonur.controller;

import com.halitonur.dto.DtoEmployee;
import com.halitonur.model.RootEntity;

public interface RestEmployeeController {
   public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
