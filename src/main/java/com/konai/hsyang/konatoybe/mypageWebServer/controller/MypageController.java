package com.konai.hsyang.konatoybe.mypageWebServer.controller;

import com.konai.hsyang.konatoybe.commentsWebServer.service.CommentsService;
import com.konai.hsyang.konatoybe.loginWebServer.config.auth.PrincipalDetails;
import com.konai.hsyang.konatoybe.loginWebServer.service.UserService;
import com.konai.hsyang.konatoybe.postsWebServer.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class MypageController {

    private final PostsService postsService;
    private final UserService userService;
    private final CommentsService commentsService;

    @GetMapping("/mypage")
    public String myPage(Model model, @AuthenticationPrincipal PrincipalDetails principalDetails){

        model.addAttribute("nickname", principalDetails.getNickname());
        return "mypage";
    }

    @GetMapping("/mypage/posts")
    public String myPosts(Model model, @AuthenticationPrincipal PrincipalDetails principalDetails){

        model.addAttribute("userPosts", postsService.findAllDescById(principalDetails.getId()));
        model.addAttribute("nickname", principalDetails.getNickname());
        return "mypage-posts";
    }

    @GetMapping("/mypage/comments")
    public String myComments(Model model, @AuthenticationPrincipal PrincipalDetails principalDetails) {

        model.addAttribute("userComments", commentsService.findAllByUserId(principalDetails.getId()));
        model.addAttribute("nickname", principalDetails.getNickname());
        return "mypage-comments";
    }

    @GetMapping("/mypage/update")
    public String updateMe(Model model, @AuthenticationPrincipal PrincipalDetails principalDetails){

        model.addAttribute("user", userService.findByUsername(principalDetails.getUsername()));
        return "mypage-update";
    }

    @GetMapping("/mypage/delete")
    public String deleteMe(Model model, @AuthenticationPrincipal PrincipalDetails principalDetails){

        model.addAttribute("userID", principalDetails.getId());
        return "mypage-delete";
    }
}
