package com.interview.application.controllers;

import com.interview.application.validators.UserValidator;
import com.interview.domain.user.model.request.UserRegRequest;
import com.interview.domain.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController extends BaseController {
    private UserService userService;
    private UserValidator userValidator;

    @PostMapping("reg")
    public ResponseEntity save(@RequestBody UserRegRequest request) {
        userValidator.validateUserRegRequest(request);

        userService.userReg(request);

        return success();
    }

}
