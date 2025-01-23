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
    private EmployeeRepo doctorRepo;

    @Override
    public Employee save(EmployeeCreate request) {
        Employee doctor =new Employee();
        doctor.setName(request.getName());
        doctor.setEmail(request.getEmail());
        return doctorRepo.save(doctor);
    }

    @Override
    public List<Employee> getDoctors() {
        return doctorRepo.findAll();
    }

    @Override
    public List<Employee> searchDoctors(String query) {
        return doctorRepo.findByEmail(query);
    }

}


