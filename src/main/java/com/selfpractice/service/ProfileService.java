package com.selfpractice.service;

import com.selfpractice.entity.Profile;
import com.selfpractice.entity.ProfileCreate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProfileService {
    Profile save(ProfileCreate request);
    List<Profile> getProfile();
    List<Profile> searchProfile(String query);
}
