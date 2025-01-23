package com.selfpractice.controller;

import com.selfpractice.entity.Employee;
import com.selfpractice.entity.EmployeeCreate;
import com.selfpractice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/practice")
@RestController

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<Employee> save(@RequestBody EmployeeCreate request){

        return new ResponseEntity<>(employeeService.save(request), HttpStatus.CREATED);
    }
    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getDoctors(){
        return new ResponseEntity<>(employeeService.getDoctors(),HttpStatus.OK);
    }
    @GetMapping("/employee/search")
    public ResponseEntity<List<Employee>> search(@RequestParam String query){
        return new ResponseEntity<>(employeeService.searchDoctors(query), HttpStatus.OK);
    }

}
