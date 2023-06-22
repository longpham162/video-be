package com.interview.domain.user.repository;

import com.interview.application.base.repository.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<UserRepository, Long> {
}
