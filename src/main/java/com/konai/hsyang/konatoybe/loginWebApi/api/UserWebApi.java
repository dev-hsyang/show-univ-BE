package com.konai.hsyang.konatoybe.loginWebApi.api;

import com.konai.hsyang.konatoybe.loginWebApi.domain.User;
import com.konai.hsyang.konatoybe.loginWebApi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserWebApi {

    private final UserService userService;

    @GetMapping("/api/user/{username}")
    public User findByUsername(@PathVariable String username){

        return userService.findByUsername(username);
    }

    @GetMapping("/api/user/{id}")
    public User findById(@PathVariable Long userID){

        return userService.findById(userID);
    }
}
