package com.konai.hsyang.konatoybe.comments.repository;

import com.konai.hsyang.konatoybe.comments.dto.CommentsResponseDto;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentsCustomRepository {

    List<CommentsResponseDto> findAllbyUserId(@Param("userId") Long userId);
    List<CommentsResponseDto> findAllByPostId(@Param("postId") Long postId);
}
