package com.example.RegisterLoginService.Service.Impl;

import com.example.RegisterLoginService.DTO.AppUserDTO;
import com.example.RegisterLoginService.Entity.AppUser;
import com.example.RegisterLoginService.Repo.AppUserRepo;
import com.example.RegisterLoginService.Service.AppUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AppUserIMPL implements AppUserService {
    @Autowired
    private AppUserRepo appUserRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String addUser(AppUserDTO appUserDTO) {
        try {
            log.info("Adding new User");
            AppUser appUser = new AppUser(
                    appUserDTO.getUserId(),
                    appUserDTO.getFullName(),
                    appUserDTO.getEmail(),
                    this.passwordEncoder.encode(appUserDTO.getPassword())
            );
            appUserRepo.save(appUser);
            return appUser.getFullName();

        } catch (Exception exception) {
            log.error("Exception Encountered while Saving User ::", exception);
        }

        return null;
    }
}
