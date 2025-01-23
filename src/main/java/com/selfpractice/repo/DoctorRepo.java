package com.selfpractice.repo;

import com.selfpractice.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface DoctorRepo extends JpaRepository<Doctor, Long> {
  List<Doctor> findByEmail(String query);

}
