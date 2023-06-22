package com.interview.domain.vote.model.entity;

import com.interview.domain.user.model.entity.User;
import com.interview.domain.video.model.entity.Video;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity(name = "test_vote")
public class Vote {
    @Id
    private Long id;

    @Column(nullable = false)
    @OneToOne
    private User user;

    @Column(nullable = false)
    @OneToOne
    private Video video;
}
