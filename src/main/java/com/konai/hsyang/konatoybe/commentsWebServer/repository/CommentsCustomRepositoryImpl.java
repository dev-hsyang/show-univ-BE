package com.konai.hsyang.konatoybe.commentsWebServer.repository;

import com.konai.hsyang.konatoybe.commentsWebServer.dto.CommentsResponseDto;
import com.konai.hsyang.konatoybe.commentsWebServer.dto.QCommentsResponseDto;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.List;

import static com.konai.hsyang.konatoybe.commentsWebServer.domain.QComments.*;

@RequiredArgsConstructor
@Repository
public class CommentsCustomRepositoryImpl implements CommentsCustomRepository{

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<CommentsResponseDto> findAllbyUserId(Long userId) {
        return jpaQueryFactory
                .select(new QCommentsResponseDto(comments))
                .from(comments)
                .where(comments.user.userID.eq(userId))
                .orderBy(comments.createdate.desc())
                .fetch();
    }

    @Override
    public List<CommentsResponseDto> findAllByPostId(Long postId) {
        return jpaQueryFactory
                .select(new QCommentsResponseDto(comments))
                .from(comments)
                .where(comments.post.postsID.eq(postId))
                .orderBy(comments.createdate.asc())
                .fetch();
    }
}
