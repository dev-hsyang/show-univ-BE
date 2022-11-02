package com.konai.hsyang.konatoybe.commentsWebServer.repository;

import com.konai.hsyang.konatoybe.commentsWebServer.domain.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comments, Long>, CommentsCustomRepository {
}
