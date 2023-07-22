package com.example.RegisterLoginService.DTO;


public class AppUserDTO {

    private int appUserId;
    private String userFullName;
    private String email;
    private String password;

    public AppUserDTO(int appUserId, String userFullName, String email, String password) {
        this.appUserId = appUserId;
        this.userFullName = userFullName;
        this.email = email;
        this.password = password;
    }

    public AppUserDTO() {
    }

    public int getAppUserId() {
        return appUserId;
    }

    public void setAppUserId(int appUserId) {
        this.appUserId = appUserId;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AppUserDTO{" +
                "appUserId=" + appUserId +
                ", userFullName='" + userFullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
