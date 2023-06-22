package com.interview.domain.video.repository;

import com.interview.application.base.repository.GenericRepository;
import com.interview.domain.video.model.entity.Video;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends GenericRepository<Video, Long> {
}
