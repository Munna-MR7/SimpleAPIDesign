package com.selfpractice.service;
import com.selfpractice.entity.Doctor;
import com.selfpractice.entity.DoctorCreate;
import com.selfpractice.repo.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class DoctorServiceImplementation implements DoctorService {
    @Autowired
    private DoctorRepo doctorRepo;

    @Override
    public Doctor save(DoctorCreate request) {
        Doctor doctor =new Doctor();
        doctor.setName(request.getName());
        doctor.setEmail(request.getEmail());
        return doctorRepo.save(doctor);
    }

    @Override
    public List<Doctor> getDoctors() {
        return doctorRepo.findAll();
    }

    @Override
    public List<Doctor> searchDoctors(String query) {
        return doctorRepo.findByEmail(query);
    }

}


