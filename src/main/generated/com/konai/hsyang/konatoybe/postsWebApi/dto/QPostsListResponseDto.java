package com.konai.hsyang.konatoybe.postsWebApi.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.konai.hsyang.konatoybe.postsWebApi.dto.QPostsListResponseDto is a Querydsl Projection type for PostsListResponseDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QPostsListResponseDto extends ConstructorExpression<PostsListResponseDto> {

    private static final long serialVersionUID = -1479745138L;

    public QPostsListResponseDto(com.querydsl.core.types.Expression<? extends com.konai.hsyang.konatoybe.postsWebApi.domain.Posts> entity) {
        super(PostsListResponseDto.class, new Class<?>[]{com.konai.hsyang.konatoybe.postsWebApi.domain.Posts.class}, entity);
    }

}

