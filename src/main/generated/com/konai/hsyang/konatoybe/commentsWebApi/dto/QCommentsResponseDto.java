package com.konai.hsyang.konatoybe.commentsWebApi.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.konai.hsyang.konatoybe.commentsWebApi.dto.QCommentsResponseDto is a Querydsl Projection type for CommentsResponseDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QCommentsResponseDto extends ConstructorExpression<CommentsResponseDto> {

    private static final long serialVersionUID = 1396144868L;

    public QCommentsResponseDto(com.querydsl.core.types.Expression<? extends com.konai.hsyang.konatoybe.commentsWebApi.domain.Comments> entity) {
        super(CommentsResponseDto.class, new Class<?>[]{com.konai.hsyang.konatoybe.commentsWebApi.domain.Comments.class}, entity);
    }

}

