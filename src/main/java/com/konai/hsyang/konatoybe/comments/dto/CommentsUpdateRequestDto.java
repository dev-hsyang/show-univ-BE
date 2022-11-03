package com.konai.hsyang.konatoybe.comments.dto;

import com.konai.hsyang.konatoybe.comments.domain.Comments;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentsUpdateRequestDto {

    private Long commentsID;
    private String content;
    private LocalDateTime createdate;
    private LocalDateTime modifieddate;

    public Comments toEntity() {
        return Comments.builder()
                .content(content)
                .build();
    }
}
