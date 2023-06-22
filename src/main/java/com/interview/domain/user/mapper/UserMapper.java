package com.interview.domain.user.mapper;

import com.interview.application.utils.BeanUtil;
import com.interview.domain.user.model.entity.User;
import com.interview.domain.user.model.request.UserRegRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserMapper {

    public User toUser(UserRegRequest request) {
        User user = new User();
        BeanUtil.refine(request, user, BeanUtil::copyNonNull);

        return user;
    }
}
