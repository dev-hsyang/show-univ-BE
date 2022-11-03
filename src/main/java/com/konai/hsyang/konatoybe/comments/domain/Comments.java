package com.konai.hsyang.konatoybe.comments.domain;

import com.konai.hsyang.konatoybe.comments.dto.CommentsUpdateRequestDto;
import com.konai.hsyang.konatoybe.login.domain.User;
import com.konai.hsyang.konatoybe.posts.domain.Posts;
import com.konai.hsyang.konatoybe.posts.etc.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Comments extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentsID;

    @ManyToOne
    @JoinColumn(name="post")
    private Posts post;

    @ManyToOne
    @JoinColumn(name = "user")
    private User user;

    private String content;

    public void update(CommentsUpdateRequestDto requestDto) {

        this.content = requestDto.getContent();
    }
}
