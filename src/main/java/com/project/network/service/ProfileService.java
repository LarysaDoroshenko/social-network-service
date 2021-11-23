package com.project.network.service;

import com.project.network.dto.ProfileDto;
import com.project.network.entity.Profile;
import com.project.network.repository.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileDto create(ProfileDto request) {
        Profile profile = new Profile();
        profile.setId(UUID.randomUUID().toString());
        profile.setFirstName(request.firstName);
        profile.setSecondName(request.secondName);
        profileRepository.save(profile);
        return request;
    }

}
