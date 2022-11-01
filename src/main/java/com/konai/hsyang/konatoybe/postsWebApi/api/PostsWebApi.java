package com.konai.hsyang.konatoybe.postsWebApi.api;

import com.konai.hsyang.konatoybe.locationWebApi.dto.LocationSaveRequestDto;
import com.konai.hsyang.konatoybe.locationWebApi.service.LocationService;
import com.konai.hsyang.konatoybe.loginWebApi.domain.User;
import com.konai.hsyang.konatoybe.loginWebApi.service.UserService;
import com.konai.hsyang.konatoybe.postsWebApi.dto.*;
import com.konai.hsyang.konatoybe.postsWebApi.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostsWebApi {

    private final PostsService postsService;
    private final LocationService locationService;

    @PostMapping(value = "/api/v2/posts", consumes = "application/json")
    public Long save(@RequestBody PostsSaveRequestDto requestDto, @RequestParam Long id){

        postsService.setPostAuthor(requestDto, id);
        postsService.setLocation(requestDto, locationService.save(new LocationSaveRequestDto(requestDto.getLatitude(), requestDto.getLongtitude())));
        return postsService.save(requestDto);
    }

    @GetMapping("/api/v2/posts/{id}")
    public PostsResponseDto postFindById(@PathVariable Long id){

        return postsService.postsResponseDtoFindById(id);
    }

    @PostMapping("/api/v2/posts/update/{id}")
    public Long updatePost(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){

        return postsService.update(id, requestDto);
    }

    @PostMapping("/api/v2/posts/delete/{id}")
    public Long deletePost(@PathVariable Long id){

        return postsService.delete(id);
    }

    @PostMapping("/api/v2/posts/paging")
    public Page<PostsListResponseDto> page(@RequestBody PageRequestDto requestDto, @PageableDefault(size=15, sort="createdate") Pageable pageable){

        return postsService.getPage(requestDto, pageable);
    }
    @PostMapping("/api/v2/posts/image")
    public PostsImageResponseDto image(@RequestParam("image") MultipartFile multi){

        return postsService.uploadImage(multi);
    }

    @GetMapping("/api/v2/posts/update/{id}")
    public void updateHits(@PathVariable Long id){

        postsService.updateHits(id);
    }

    @GetMapping("/api/v2/posts/dto/{id}")
    public PostsResponseDto postsResponseDto(@PathVariable Long id){

        return postsService.postsResponseDtoFindById(id);
    }

    @PostMapping("/api/v2/posts/{id}")
    public boolean isPostAuthor(@PathVariable Long id, @RequestBody PostsResponseDto dto){

        return postsService.isPostAuthor(id, dto);
    }

    @GetMapping("/api/v2/posts/current")
    public List<PostsListResponseDto> findAllDescCurrent(){

        return postsService.findAllDescCurrent();
    }

    @GetMapping("/api/v2/posts/hits")
    public List<PostsListResponseDto> findAllDescHits(){

        return postsService.findAllDescHits();
    }

    @GetMapping("/api/v2/posts/likes")
    public List<PostsListResponseDto> findAllDescLikes(){

        return postsService.findAllDescLikes();
    }




}
