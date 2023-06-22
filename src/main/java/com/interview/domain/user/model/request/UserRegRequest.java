package com.interview.domain.user.model.request;

import lombok.Data;

@Data
public class UserRegRequest {
    private String email;
    private String password;
}
