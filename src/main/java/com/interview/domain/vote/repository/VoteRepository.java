package com.interview.domain.vote.repository;

import com.interview.application.base.repository.GenericRepository;
import com.interview.domain.vote.model.entity.Vote;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends GenericRepository<Vote, Long> {
}
