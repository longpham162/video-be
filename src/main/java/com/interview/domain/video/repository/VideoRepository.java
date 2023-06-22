package com.interview.domain.video.repository;

import com.interview.application.base.repository.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends GenericRepository<VideoRepository, Long> {
}
