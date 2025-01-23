package com.selfpractice.service;

import com.selfpractice.entity.Doctor;
import com.selfpractice.entity.DoctorCreate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DoctorService {
    Doctor save(DoctorCreate request);
    List<Doctor> getDoctors();
    List<Doctor> searchDoctors(String query);

}
