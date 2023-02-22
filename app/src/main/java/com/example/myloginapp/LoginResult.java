package com.example.myloginapp;

public class LoginResult {


    private String username;

    private String email;
    private String password;

    public LoginResult(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public LoginResult(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}


