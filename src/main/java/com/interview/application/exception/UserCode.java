package com.interview.application.exception;

import org.springframework.http.HttpStatus;

public class UserCode {
    public static final ResponseStatus USER_REG_NULL =
            new ResponseStatus("USER_REG_NULL", "Object is null", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_EMAIL_EMPTY =
            new ResponseStatus("USER_EMAIL_EMPTY", "Email is empty", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_PASSWORD_EMPTY =
            new ResponseStatus("USER_PASSWORD_EMPTY", "Password is empty", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_EMAIL_MAX_LENGTH =
            new ResponseStatus("USER_EMAIL_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_PASSWORD_MAX_LENGTH =
            new ResponseStatus("USER_PASSWORD_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_EMAIL_EXIST =
            new ResponseStatus("USER_EMAIL_EXIST", "User email is existed", HttpStatus.CONFLICT);
}
