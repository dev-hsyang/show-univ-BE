package com.konai.hsyang.konatoybe.comments.repository;

import com.konai.hsyang.konatoybe.comments.domain.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comments, Long>, CommentsCustomRepository {
}
