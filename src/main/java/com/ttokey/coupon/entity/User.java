package com.ttokey.coupon.entity;

import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
public class User {
    private String id;

    private String name;
    private String userId;
    private String password;
    private String phoneNumber;
    private String custStatus;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
