package com.selfpractice.repo;

import com.selfpractice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
  List<Employee> findByEmail(String query);

}
