package com.konai.hsyang.konatoybe.mypageWebServer.controller;

import com.konai.hsyang.konatoybe.loginWebServer.dto.UserUpdateRequestDto;
import com.konai.hsyang.konatoybe.loginWebServer.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MypageApiController {

    private final UserService userService;

    @PostMapping("/api/mypage/update-nickname/{id}")
    public Long updateNickname(@PathVariable Long id, @RequestBody UserUpdateRequestDto requestDto){

        return userService.updateNickname(id, requestDto);
    }

    @PostMapping("/api/mypage/update-password/{id}")
    public Long updatePassword(@PathVariable Long id, @RequestBody UserUpdateRequestDto requestDto){

        return userService.updatePassword(id, requestDto);
    }

    @PostMapping("/api/mypage/delete/{id}")
    public void deleteUser(@PathVariable Long id){

        userService.delete(id);
    }
}
