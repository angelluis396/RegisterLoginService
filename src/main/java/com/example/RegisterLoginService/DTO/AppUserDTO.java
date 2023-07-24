package com.example.RegisterLoginService.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class AppUserDTO {
    private int userId;
    private String fullName;
    private String email;
    private String password;
    public AppUserDTO() {
    }

    @Override
    public String toString() {
        return "AppUserDTO{" +
                "userId=" + userId +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
