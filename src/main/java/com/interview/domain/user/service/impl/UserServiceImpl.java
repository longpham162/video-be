package com.interview.domain.user.service.impl;

import com.interview.application.exception.BusinessException;
import com.interview.application.exception.UserCode;
import com.interview.application.utils.CryptoAlgorithmUtils;
import com.interview.domain.user.mapper.UserMapper;
import com.interview.domain.user.model.entity.User;
import com.interview.domain.user.model.request.UserRegRequest;
import com.interview.domain.user.repository.UserRepository;
import com.interview.domain.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    @Override
    public void userReg(UserRegRequest request) {
        boolean checkUserEmailExist = checkUserEmailExist(request.getEmail());
        if (checkUserEmailExist) {
            throw new BusinessException(UserCode.USER_EMAIL_EXIST);
        }

        User user = userMapper.toUser(request);
        user.setPassword(CryptoAlgorithmUtils.md5(user.getPassword()));

        userRepository.save(user);
    }

    private boolean checkUserEmailExist(String email) {
        Optional<User> userOptional = userRepository.getUserByEmail(email);

        return userOptional.isPresent();
    }
}
