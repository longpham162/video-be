package com.interview.domain.vote.model.entity;

import com.interview.domain.user.model.entity.User;
import com.interview.domain.video.model.entity.Video;
import com.interview.domain.vote.constant.VoteType;
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

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "video_id")
    private Video video;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private VoteType voteType;
}
