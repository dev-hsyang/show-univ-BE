package com.konai.hsyang.konatoybe.commentsWebApi.domain;

import com.konai.hsyang.konatoybe.commentsWebApi.dto.CommentsUpdateRequestDto;
import com.konai.hsyang.konatoybe.loginWebApi.domain.User;
import com.konai.hsyang.konatoybe.postsWebApi.domain.Posts;
import com.konai.hsyang.konatoybe.postsWebApi.etc.BaseTimeEntity;
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
