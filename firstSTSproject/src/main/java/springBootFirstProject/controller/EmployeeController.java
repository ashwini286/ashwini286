package springBootFirstProject.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springBootFirstProject.controller.service.EmployeeService;


@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeservice;
	
	@RequestMapping("/name")
	public String welcome() {
		return "ashwini";
	}
	@RequestMapping("/employee")
public List<Employee> getAllEmployees(){
	return employeeservice.getAllEmployee();
}
	
	
	@RequestMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
	return	employeeservice.getEmployeeById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/employee")
	public void addEmployee(@RequestBody Employee employee) {
		employeeservice.addEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/employee/{id}")
	public void UpdateEmployee(@RequestBody Employee employee, @PathVariable int id ) {
		employeeservice.UpdateEmployee(employee,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/employee/{id}")
	public void DeleteEmployee( @PathVariable int id) {
		employeeservice.DeleteEmployee( id);
	}
	
	
	
}
