package com.interview.application.controllers;

import com.interview.application.base.model.BaseResponse;
import com.interview.security.UserAuthentication;
import com.interview.security.UserDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;

public abstract class BaseController {

    protected UserDetail getUserDetail() {
        UserAuthentication userAuthentication = (UserAuthentication) SecurityContextHolder.getContext().getAuthentication();
        UserDetail userDetails = (UserDetail) userAuthentication.getDetails();

        return userDetails;
    }

    public ResponseEntity success() {
        return ResponseEntity.ok(BaseResponse.success());
    }

    public <T> ResponseEntity<BaseResponse<T>> success(T data) {
        return ResponseEntity.ok(BaseResponse.success(data));
    }
}