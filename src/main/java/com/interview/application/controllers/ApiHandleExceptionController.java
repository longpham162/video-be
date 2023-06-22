package com.interview.application.controllers;

import com.interview.application.base.model.BaseResponse;
import com.interview.application.exception.BusinessException;
import com.interview.application.exception.ResponseStatus;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@AllArgsConstructor
public class ApiHandleExceptionController {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<BaseResponse<ResponseStatus>> handleUrlExisted(BusinessException businessException) {
        return new ResponseEntity<>(BaseResponse.fail(businessException), businessException.getResponseStatus().getStatus());
    }
}