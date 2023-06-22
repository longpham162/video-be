package com.interview.domain.user.model.entity;

import com.interview.domain.video.model.entity.Video;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@ToString
@Entity(name = "test_user")
public class User {

    @Id
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToMany
    private List<Video> videos;
}
