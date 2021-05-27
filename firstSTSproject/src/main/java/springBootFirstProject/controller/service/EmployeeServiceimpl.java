package springBootFirstProject.controller.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import springBootFirstProject.controller.Employee;

@Service
public class EmployeeServiceimpl implements EmployeeService {
List<Employee> empList = new ArrayList<> (Arrays.asList(
		new Employee(1 , "ashwini" ," payments"),
		new Employee(2 , "sita" ," pay"),
		new Employee(3 , "gita" ," abc"),
		new Employee(4 , "mohan" ," xyz")));

@Override
public List<Employee> getAllEmployee() {
	// TODO Auto-generated method stub
	return empList;
}

@Override
public Employee getEmployeeById(int id) {
return	empList.stream().filter(e->e.getId() == id).findFirst().get();
	
}

@Override
public void addEmployee(Employee employee) {
	// TODO Auto-generated method stub
	empList.add(employee);
}

@Override
public void UpdateEmployee(Employee employee , int id) {
	// TODO Auto-generated method stub
	for(int i=0 ; i<empList.size(); i++) {
		Employee e = empList.get(i);
				if(e.getId()==id) {
					empList.set(i, employee);
					return;
				}
	}
}

@Override
public void DeleteEmployee(int id) {
	// TODO Auto-generated method stub
	empList.removeIf(e->e.getId()==id);
}
}
