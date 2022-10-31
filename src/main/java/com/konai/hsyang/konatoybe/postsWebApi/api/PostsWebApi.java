package com.konai.hsyang.konatoybe.postsWebApi.api;

import com.konai.hsyang.konatoybe.locationWebApi.service.LocationService;
import com.konai.hsyang.konatoybe.loginWebApi.domain.User;
import com.konai.hsyang.konatoybe.loginWebApi.service.UserService;
import com.konai.hsyang.konatoybe.postsWebApi.dto.PostsResponseDto;
import com.konai.hsyang.konatoybe.postsWebApi.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsWebApi {

    private final PostsService postsService;
    private final LocationService locationService;

    @GetMapping("/api/posts/update/{id}")
    public void updateHits(@PathVariable Long id){

        postsService.updateHits(id);
    }

    @GetMapping("/api/posts-dto/{id}")
    public PostsResponseDto postsResponseDto(@PathVariable Long id){

        return postsService.postsResponseDtoFindById(id);
    }


}
