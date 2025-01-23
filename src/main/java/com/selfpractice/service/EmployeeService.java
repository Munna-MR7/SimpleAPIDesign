package com.selfpractice.service;

import com.selfpractice.entity.Employee;
import com.selfpractice.entity.EmployeeCreate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeService {
    Employee save(EmployeeCreate request);
    List<Employee> getDoctors();
    List<Employee> searchDoctors(String query);

}
