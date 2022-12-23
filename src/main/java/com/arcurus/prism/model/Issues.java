package com.arcurus.prism.model;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;
    public class Issues {

        @Id
        private String id;
        private String status;
        private Date timestamp;
        private String email;
        private String phoneNumber;
        private String fullname;
        private String message;
        private String userId;
        private String closedBy;
        private Date closedOn;
        private List<Help> helpMessages;

    }
