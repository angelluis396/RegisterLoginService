package com.example.RegisterLoginService.Controller;


import com.example.RegisterLoginService.DTO.AppUserDTO;
import com.example.RegisterLoginService.Service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private AppUserService appUserService;

    @PostMapping(path = "/save")
    public String saveUser(@RequestBody AppUserDTO appUserDTO){
        String id = AppUserService.addUser();
        return id;
    }

}
