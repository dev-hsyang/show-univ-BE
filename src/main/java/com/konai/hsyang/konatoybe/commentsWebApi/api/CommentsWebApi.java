package com.konai.hsyang.konatoybe.commentsWebApi.api;

import com.konai.hsyang.konatoybe.commentsWebApi.dto.CommentsResponseDto;
import com.konai.hsyang.konatoybe.commentsWebApi.service.CommentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CommentsWebApi {

    private final CommentsService commentsService;

    @PostMapping("/api/comments/list")
    public List<CommentsResponseDto> getCommentsList(@RequestParam("nickname") String nickname, @RequestParam("postID") Long postID){

        return commentsService.getCommentsList(nickname, postID);
    }
}
