package com.project.network.controller;

import com.project.network.dto.ProfileDto;
import com.project.network.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile/")
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    ProfileDto create(@RequestBody ProfileDto request) {
        return profileService.create(request);
    }

}
