package com.example.supercodingnotice.dto;

public class LoginRequest {
    private String email;
    private String password;

    // 기본 생성자
    public LoginRequest() {
    }

    // 모든 필드를 사용하는 생성자
    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // getter 및 setter
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
        return "LoginRequest{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
