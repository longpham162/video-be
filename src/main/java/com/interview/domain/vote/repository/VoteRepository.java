package com.interview.domain.vote.repository;

import com.interview.application.base.repository.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends GenericRepository<VoteRepository, Long> {
}
