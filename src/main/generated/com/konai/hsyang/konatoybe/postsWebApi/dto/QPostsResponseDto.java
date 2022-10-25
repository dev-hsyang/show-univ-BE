package com.konai.hsyang.konatoybe.postsWebApi.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.konai.hsyang.konatoybe.postsWebApi.dto.QPostsResponseDto is a Querydsl Projection type for PostsResponseDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QPostsResponseDto extends ConstructorExpression<PostsResponseDto> {

    private static final long serialVersionUID = -1135304692L;

    public QPostsResponseDto(com.querydsl.core.types.Expression<? extends com.konai.hsyang.konatoybe.postsWebApi.domain.Posts> entity) {
        super(PostsResponseDto.class, new Class<?>[]{com.konai.hsyang.konatoybe.postsWebApi.domain.Posts.class}, entity);
    }

}

