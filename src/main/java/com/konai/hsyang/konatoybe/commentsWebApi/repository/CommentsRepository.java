package com.konai.hsyang.konatoybe.commentsWebApi.repository;

import com.konai.hsyang.konatoybe.commentsWebApi.domain.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comments, Long>, CommentsCustomRepository {
}
