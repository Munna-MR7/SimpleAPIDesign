package com.selfpractice.service;
import com.selfpractice.entity.Employee;
import com.selfpractice.entity.EmployeeCreate;
import com.selfpractice.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class EmployeeServiceImplementation implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee save(EmployeeCreate request) {
        Employee employee =new Employee();
        employee.setName(request.getName());
        employee.setEmail(request.getEmail());
        return employeeRepo.save(employee);
    }



    @Override
    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public List<Employee> searchEmployees(String query) {
        return employeeRepo.findByEmail(query);
    }

}


