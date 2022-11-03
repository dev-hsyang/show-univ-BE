package com.konai.hsyang.konatoybe.login.api;

import com.konai.hsyang.konatoybe.login.domain.User;
import com.konai.hsyang.konatoybe.login.dto.UserJoinRequestDto;
import com.konai.hsyang.konatoybe.login.service.ClubService;
import com.konai.hsyang.konatoybe.login.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class LoginWebApi {

    private final UserService userService;
    private final ClubService clubService;

    @GetMapping("/api/v2/user/{username}")
    public User findByUsername(@PathVariable String username){

        return userService.findByUsername(username);
    }

//    @GetMapping("/api/v2/user/{id}")
//    public User findById(@PathVariable Long userID){
//
//        return userService.findById(userID);
//    }

    @PostMapping("/api/v2/join")
    public Long join(@RequestBody UserJoinRequestDto requestDto){

        return userService.join(requestDto);
    }

    @PostMapping("/api/v2/club")
    public void setClub(@RequestBody UserJoinRequestDto requestDto, @RequestParam("club") String club){

        clubService.setClub(club, requestDto);
    }

    @GetMapping("/api/v2/join/checkId")
    public int validateUsername(@RequestParam("username") String username){

        return userService.validateID(username);
    }

    @GetMapping("/api/v2/join/checkNick")
    public int validateNickname(@RequestParam("nickname") String nickname){

        return userService.validateNickname(nickname);
    }
}
