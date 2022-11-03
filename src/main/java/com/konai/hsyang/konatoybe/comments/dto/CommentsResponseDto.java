package com.konai.hsyang.konatoybe.comments.dto;

import com.konai.hsyang.konatoybe.comments.domain.Comments;
import com.querydsl.core.annotations.QueryProjection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class CommentsResponseDto {

    private Long commentsID;
    private Long postID;
    private String nickname;
    private String content;
    private LocalDateTime createdate;
    private LocalDateTime modifieddate;
    private String formatCreateDate;
    private String formatModifiedDate;
    private Boolean isWriter;

    @QueryProjection
    public CommentsResponseDto(Comments entity){
        this.commentsID = entity.getCommentsID();
        this.content = entity.getContent();
        this.nickname = entity.getUser().getNickname();
        this.postID = entity.getPost().getPostsID();
        this.createdate = entity.getCreatedate();
        this.modifieddate = entity.getModifieddate();
        this.formatCreateDate = entity.getCreatedate().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        this.formatModifiedDate = entity.getModifieddate().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
    }

    public void setFlag(Boolean bool) {

        this.isWriter = bool;
    }
}
