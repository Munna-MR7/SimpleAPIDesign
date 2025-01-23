package com.selfpractice.repo;

import com.selfpractice.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface ProfileRepo extends JpaRepository<Profile, Long> {
    List<Profile> findByEmail(String query);
}
