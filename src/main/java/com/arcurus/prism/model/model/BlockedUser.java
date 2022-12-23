package com.arcurus.prism.model.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class BlockedUser {
    @Id
    private String id;
    private Users users;
    private String blockedBy;
    private Date blockedOn;

}
