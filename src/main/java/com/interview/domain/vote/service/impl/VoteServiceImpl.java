package com.interview.domain.vote.service.impl;

import com.interview.domain.vote.repository.VoteRepository;
import com.interview.domain.vote.service.VoteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VoteServiceImpl implements VoteService {

    private VoteRepository voteRepository;
}
