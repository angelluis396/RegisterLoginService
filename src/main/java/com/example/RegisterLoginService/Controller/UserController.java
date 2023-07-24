package com.example.RegisterLoginService.Controller;


import com.example.RegisterLoginService.DTO.AppUserDTO;
import com.example.RegisterLoginService.Service.AppUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
@Slf4j
public class UserController {
    @Autowired
    private AppUserService appUserService;

    @PostMapping(path = "/save")
    public String saveUser(@RequestBody AppUserDTO appUserDTO){
        try {
            log.info("Saving new User");
            String savedUser = appUserService.addUser(appUserDTO);
            return savedUser;
        } catch (Exception exception) {
            log.error("Exception Encountered while Saving User ::", exception);
        }


        return null;
    }

}
