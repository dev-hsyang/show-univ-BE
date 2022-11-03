package com.konai.hsyang.konatoybe.posts.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PageRequestDto {

    private String nickname;
    private String title;

    public void setPageDefault(){

        this.nickname = null;
        this.title = null;
    }
}
