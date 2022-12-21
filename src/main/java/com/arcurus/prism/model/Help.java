package com.arcurus.prism.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Help {
    @Id
    private String id;
    private String userId;
    private String issueId;
    private String email;
    private String message;

    private boolean read;
    private Date timestamp;
    private String phoneNumber;
    private String fullname;
    private String reply;
    private String status;

}
