package com.interview.domain.user.repository;

import com.interview.application.base.repository.GenericRepository;
import com.interview.domain.user.model.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<User, Long> {
}
