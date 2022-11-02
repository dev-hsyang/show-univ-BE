package com.konai.hsyang.konatoybe.commentsWebServer.api;

import com.konai.hsyang.konatoybe.commentsWebServer.dto.CommentsResponseDto;
import com.konai.hsyang.konatoybe.commentsWebServer.dto.CommentsSaveRequestDto;
import com.konai.hsyang.konatoybe.commentsWebServer.dto.CommentsUpdateRequestDto;
import com.konai.hsyang.konatoybe.commentsWebServer.service.CommentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CommentsWebApi {

    private final CommentsService commentsService;

    @PostMapping("/api/v2/comments/list")
    public List<CommentsResponseDto> getCommentsList(@RequestParam("nickname") String nickname, @RequestParam("postID") Long postID){

        return commentsService.getCommentsList(nickname, postID);
    }

    @PostMapping("/api/v2/comments/save")
    public ResponseEntity<?> saveComment(@RequestParam("postID") Long postID, @RequestParam("username") String username, @RequestBody CommentsSaveRequestDto requestDto){

        return ResponseEntity.ok(commentsService.saveComment(username, postID, requestDto));
    }

    @PostMapping("/api/v2/comments/delete/{commentID}")
    public Long deleteComment(@PathVariable Long commentID) {

        return commentsService.delete(commentID);
    }

    @PostMapping("/api/v2/comments/update/{commentID}")
    public Long updateComment(@PathVariable Long commentID, @RequestBody CommentsUpdateRequestDto requestDto) {

        return commentsService.update(commentID, requestDto);
    }

    @GetMapping("/api/v2/comments/click/{commentID}")
    public Long findPostByCommentID(@PathVariable Long commentID) {

        return commentsService.getPostID(commentID);
    }

}
