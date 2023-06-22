package com.interview.domain.user.service.impl;

import com.interview.domain.user.repository.UserRepository;
import com.interview.domain.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
}
