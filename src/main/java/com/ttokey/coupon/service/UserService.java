package com.ttokey.coupon.service;

import com.ttokey.coupon.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User registUser(User user) {
        return User.builder().build();
    }
}
