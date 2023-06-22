package com.interview.domain.video.service.impl;

import com.interview.domain.video.repository.VideoRepository;
import com.interview.domain.video.service.VideoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VideoServiceImpl implements VideoService {

    private VideoRepository videoRepository;
}
