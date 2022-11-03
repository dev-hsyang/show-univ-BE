package com.konai.hsyang.konatoybe.posts.controller;

import com.konai.hsyang.konatoybe.comments.service.CommentsService;
import com.konai.hsyang.konatoybe.location.service.LocationService;
import com.konai.hsyang.konatoybe.login.config.auth.PrincipalDetails;
import com.konai.hsyang.konatoybe.posts.dto.PostsResponseDto;
import com.konai.hsyang.konatoybe.posts.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class PostsController {

    private final PostsService postsService;
    private final CommentsService commentsService;
    private final LocationService locationService;

    @GetMapping("/posts/save")
    public String savePost(){

        return "posts-saveV2";
    }

    @GetMapping("/posts/view/{id}")
    public String viewPost(@PathVariable Long id, @AuthenticationPrincipal PrincipalDetails principalDetails, Model model){

        postsService.updateHits(id);
        PostsResponseDto responseDto = postsService.postsResponseDtoFindById(id);
        model.addAttribute("post", responseDto);
//        System.out.println("****************************" + principalDetails);
//        System.out.println("****************************" + principalDetails.getAuthorities());
//        System.out.println("****************************" + principalDetails.getUsername());
        model.addAttribute("author", postsService.isPostAuthor(principalDetails.getId(), postsService.postsResponseDtoFindById(id)));
        model.addAttribute("comments", commentsService.getCommentsList(principalDetails.getNickname(), id)); // 작성자인지 아닌지 판단 위해 responseDto에서 commentsList를 불러오지 않고 별도 함수 호출
        model.addAttribute("location", locationService.responseDtoFindByID(responseDto.getLocation().getLocationID()));
        model.addAttribute("filelist", responseDto.getFiles());
        return "posts-view";
    }

    @GetMapping("/posts/update/{id}")
    public String updatePost(@PathVariable Long id, Model model){

        PostsResponseDto responseDto = postsService.postsResponseDtoFindById(id);
        model.addAttribute("post", responseDto);
        model.addAttribute("filelist", responseDto.getFiles());
        model.addAttribute("location", locationService.responseDtoFindByID(responseDto.getLocation().getLocationID()));
        return "posts-update";
    }
}
