package com.ttokey.coupon.entity;

import java.time.LocalDateTime;

public class CouponHistory {
    private String id;

    private String couponId;
    private String imagePath;
    private String status;
    private String owner;
    private String company;
    private String menuName;
    private Long price;
    private String barcode;
    private LocalDateTime dueDate;

    private LocalDateTime createdAt;
    private String createdBy;
}
