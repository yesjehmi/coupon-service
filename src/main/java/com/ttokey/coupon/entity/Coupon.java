package com.ttokey.coupon.entity;

import java.time.LocalDateTime;

public class Coupon {
    private String id;

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
    private LocalDateTime updatedAt;
    private String updatedBy;
}
