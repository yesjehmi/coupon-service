package com.ttokey.coupon.controller;

import com.ttokey.coupon.controller.request.UserRequest;
import com.ttokey.coupon.controller.response.UserResponse;
import com.ttokey.coupon.entity.User;
import com.ttokey.coupon.mapper.UserMapper;
import com.ttokey.coupon.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    private final UserMapper userMapper;

    //TODO :: 사용자 등록
    @PostMapping()
    private UserResponse createUser(@RequestBody UserRequest request) {

        User user = userMapper.requestToEntity(RequestStatus.CREATE, request);
        return userMapper.entityToResponse(userService.registUser(user));
    }

    //TODO :: 사용자 수정

    //TODO :: 사용자 조회

    //TODO :: 사용자 목록 조회 (그룹별 등 조회 조건)

    //TODO :: 사용자 탈퇴

}
