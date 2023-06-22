package com.interview.domain.video.model.entity;

import com.interview.domain.user.model.entity.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
@Entity(name = "test_video")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 500)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Long totalLike;

    @Column(nullable = false)
    private Long totalDislike;

    @Column(nullable = false)
    private Timestamp createdDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
