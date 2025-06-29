package com.halitonur.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.halitonur.dto.DtoEmployee;
import com.halitonur.service.IEmployeeService;
import com.halitonur.starter.ExceptionStarter;

@SpringBootTest(classes = {ExceptionStarter.class})
class ExceptionApplicationTests {

	@Autowired
	private IEmployeeService employeeService;
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("BeforeEach çalıştı");
	}
	
	@Test
	 public void testFindEmployeeById() {
		DtoEmployee employee = employeeService.findEmployeeById(2L);
		assertNotNull(employee); //İçindeki null olamaz
		assertEquals(2, employee.getId()); //1. beklenen değer 2. dönülen
		if(employee != null) {
			System.out.println("İsim"+ employee.getName());
		}
	 }

	@AfterEach
	public void afterEach() {
		System.out.println("Aftereach çalıştı");
	}
	
	
	
}
