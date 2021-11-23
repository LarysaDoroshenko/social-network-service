package com.project.network.service;

import com.project.network.dto.ProfileDto;
import com.project.network.entity.Profile;
import com.project.network.repository.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileDto create(ProfileDto request) {
        Profile profile = new Profile();
        profile.setFirstName(request.firstName);
        profile.setLastName(request.lastName);
        profileRepository.save(profile);
        return request;
    }

}
