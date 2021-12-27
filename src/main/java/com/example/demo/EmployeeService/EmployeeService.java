package com.example.demo.EmployeeService;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.EmployeeBean.EmployeeBean;
import com.example.demo.EmployeeRepository.EmployeeRepository;

@Service
public class EmployeeService {
	
	    @Autowired
		public EmployeeRepository employeeRepo;

		public List<EmployeeBean> getAllEmployees()
		{    
			List<EmployeeBean> employees= new ArrayList<>();
			employeeRepo.findAll().forEach(employees::add);
			return employees;
		}

		public void addEmployee(EmployeeBean employee) {
			employeeRepo.save(employee);
				
		}
		public void updateEmployee(Integer id, EmployeeBean employee) {
		if(employeeRepo.findById(id).isPresent())
		{
			employee.setEmployeeId(employee.getEmployeeId());
			employee.setName(employee.getName());
			employee.setAge(employee.getAge());
			employee.setAddress(employee.getAddress());
		
			
			employeeRepo.save(employee);
		}
		
			
		}

		public void deleteEmployee(Integer id) {
			employeeRepo.deleteById(id);
			
			
		}
		
		
	
}

