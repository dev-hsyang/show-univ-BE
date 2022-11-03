package com.konai.hsyang.konatoybe.comments.dto;

import com.konai.hsyang.konatoybe.comments.domain.Comments;
import com.konai.hsyang.konatoybe.login.domain.User;
import com.konai.hsyang.konatoybe.posts.domain.Posts;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentsSaveRequestDto {

    private Long commentsID;
    private String content;
    private User user;
    private Posts post;


    public Comments toEntity() {
        return Comments.builder()
                .post(post)
                .user(user)
                .content(content)
                .build();
    }

    public void setCommentInfo(User user, Posts post){
        this.user = user;
        this.post = post;
    }
}
