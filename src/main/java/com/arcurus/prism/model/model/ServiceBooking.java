package com.arcurus.prism.model.model;

import lombok.Data;

@Data
public class ServiceBooking {
    private String day;
    private int hour;
    private boolean available;
    private String status;

}

