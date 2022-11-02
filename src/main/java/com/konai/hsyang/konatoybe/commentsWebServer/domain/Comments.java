package com.konai.hsyang.konatoybe.commentsWebServer.domain;

import com.konai.hsyang.konatoybe.commentsWebServer.dto.CommentsUpdateRequestDto;
import com.konai.hsyang.konatoybe.loginWebServer.domain.User;
import com.konai.hsyang.konatoybe.postsWebServer.domain.Posts;
import com.konai.hsyang.konatoybe.postsWebServer.etc.BaseTimeEntity;
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
