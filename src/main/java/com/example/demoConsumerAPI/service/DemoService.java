package com.example.demoConsumerAPI.service;

import com.example.demoConsumerAPI.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DemoService {


    List<Employee> getAllEmployee();

    Employee getEmployeeById(Long id) ;

    String saveEmployee(Employee employee);

    String updateEmployee(Employee employee);

    String deleteEmployee(Long id);

    String saveAllEmployee(List<Employee> employee);
}
