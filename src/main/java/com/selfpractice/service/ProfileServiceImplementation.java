package com.selfpractice.service;

import com.selfpractice.entity.Profile;
import com.selfpractice.entity.ProfileCreate;
import com.selfpractice.repo.ProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ProfileServiceImplementation implements ProfileService {

    @Autowired
    private ProfileRepo profileRepo;
    @Override
    public Profile save(ProfileCreate request) {
        Profile profile=new Profile();
        profile.setEmail(request.getEmail());
        profile.setDesignation(request.getDesignation());
        profile.setAddress(request.getAddress());
        return profileRepo.save(profile);
    }

    @Override
    public List<Profile> getProfile() {
        return profileRepo.findAll();
    }

    @Override
    public List<Profile> searchProfile(String query) {
        return profileRepo.findByEmail(query);
    }
}
