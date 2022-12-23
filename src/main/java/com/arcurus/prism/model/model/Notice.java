package com.arcurus.prism.model.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@Document
@Data
public class Notice {
    private String id;
    private String userId;
    private String email;
    private String title;
    private String action;
    private String message;
    private Date timestamp = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
}
