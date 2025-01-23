package com.selfpractice.controller;

import com.selfpractice.entity.Doctor;
import com.selfpractice.entity.DoctorCreate;
import com.selfpractice.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/practice")
@RestController

public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/doctors")
    public ResponseEntity<Doctor> save(@RequestBody DoctorCreate request){

        return new ResponseEntity<>(doctorService.save(request), HttpStatus.CREATED);
    }
    @GetMapping("/doctors")
    public ResponseEntity<List<Doctor>> getDoctors(){
        return new ResponseEntity<>(doctorService.getDoctors(),HttpStatus.OK);
    }
    @GetMapping("/doctors/search")
    public ResponseEntity<List<Doctor>> search(@RequestParam String query){
        return new ResponseEntity<>(doctorService.searchDoctors(query), HttpStatus.OK);
    }

}
