package com.example.demo.EmployeeController;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.EmployeeBean.EmployeeBean;
import com.example.demo.EmployeeService.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@RequestMapping("/employees")
	public List<EmployeeBean> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/employees")
	public void addEmployee(@RequestBody EmployeeBean employee)
	{
		employeeService.addEmployee(employee);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/employees/{id}")
	public void updateEmployee(@PathVariable Integer id, @RequestBody EmployeeBean employee)
	{
		employeeService.updateEmployee(id, employee);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/employees/{id}")
	public void DeleteEmployee(@PathVariable Integer id)
	{
		employeeService.deleteEmployee(id);
	}
	
	
}

