package com.arcurus.prism.model.model;

import java.util.List;

public class Mail {
    private String mailFrom;

    private String mailTo;

    private String mailCc;

    private String mailBcc;

    private String mailSubject;

    private String mailContent="text/plain";

    private String contentType;

    private List< Object > attachments;
}
