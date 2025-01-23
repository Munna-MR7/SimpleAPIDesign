package com.selfpractice.controller;
import com.selfpractice.entity.Profile;
import com.selfpractice.entity.ProfileCreate;
import com.selfpractice.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/practice")
public class ProfileController {

    @Autowired
    private ProfileService profileService;
    @PostMapping("/Profile")
    public ResponseEntity<Profile> save(@RequestBody ProfileCreate request){
        return new ResponseEntity<>(profileService.save(request), HttpStatus.CREATED);
    }
    @GetMapping("/employee/profile")
    public ResponseEntity<List<Profile>>get(){
        return new ResponseEntity<>(profileService.getProfile(), HttpStatus.OK);
    }
    @GetMapping("/profile/search")
    public ResponseEntity<List<Profile>>search(@RequestParam String query){
        return new ResponseEntity<>(profileService.searchProfile(query), HttpStatus.OK);
    }

}
