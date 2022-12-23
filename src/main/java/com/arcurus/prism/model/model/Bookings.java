package com.arcurus.prism.model.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Bookings {
    @Id
    private String id;
    private String serviceId;
    private String userPhone;
    private String date;
    private int hour;
    private boolean cancelled;
    private Date timestamp;
    private Users user;
    private Services service;

}
