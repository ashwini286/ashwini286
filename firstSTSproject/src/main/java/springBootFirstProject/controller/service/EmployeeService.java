package springBootFirstProject.controller.service;

import java.util.List;

import springBootFirstProject.controller.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();
Employee getEmployeeById(int id);
void addEmployee(Employee employee);
void DeleteEmployee(int id);
void UpdateEmployee(Employee employee, int id);
}
