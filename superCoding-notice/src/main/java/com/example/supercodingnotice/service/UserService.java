package com.example.supercodingnotice.service;

import com.example.supercodingnotice.entity.User;
import com.example.supercodingnotice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User register(String email, String password) {
        if(userRepository.findByEmail(email).isPresent()) {
            throw new RuntimeException("이미 등록된 이메일입니다.");
        }
        User user = new User(email, password);  // 비밀번호 암호화 과정 추가 필요
        return userRepository.save(user);
    }

}

