package com.interview.application.validators;

import com.interview.application.exception.BusinessException;
import com.interview.application.exception.UserCode;
import com.interview.domain.user.model.request.UserRegRequest;
import org.springframework.stereotype.Component;

@Component
public class UserValidator {

    public void validateUserRegRequest(UserRegRequest request) {
        Validator.of(request)
                .requireNonNull(() -> new BusinessException(UserCode.USER_REG_NULL))
                .requireNonBlank(UserRegRequest::getEmail, () -> new BusinessException(UserCode.USER_EMAIL_EMPTY))
                .requireNonBlank(UserRegRequest::getPassword, () -> new BusinessException(UserCode.USER_PASSWORD_EMPTY))
                .validate(UserRegRequest::getEmail, email -> email.length() > 255, () -> new BusinessException(UserCode.USER_EMAIL_MAX_LENGTH))
                .validate(UserRegRequest::getPassword, password -> password.length() > 255, () -> new BusinessException(UserCode.USER_PASSWORD_MAX_LENGTH))
                .get();
    }
}
