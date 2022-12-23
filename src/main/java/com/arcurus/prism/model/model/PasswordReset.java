package com.arcurus.prism.model.model;

import lombok.Data;

/**
 * PasswordReset
 */
@Data
public class PasswordReset {
    private String password;
    private String authCode;

}