package com.ttokey.coupon.mapper;

import com.ttokey.coupon.controller.RequestStatus;
import com.ttokey.coupon.controller.request.UserRequest;
import com.ttokey.coupon.controller.response.UserResponse;
import com.ttokey.coupon.entity.User;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class UserMapper {

    public User requestToEntity(RequestStatus status, UserRequest request) {

        return User.builder()
                //Update일 때만
                .id(request.getId())
                .name(request.getName())
                .userId(request.getUserId())
                .password(request.getPassword())
                .phoneNumber(request.getPhoneNumber())
                .custStatus(request.getCustStatus())
                //Create일 때만
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
    }

    public UserResponse entityToResponse(User user) {
        return new UserResponse();
    }
}
