package com.konai.hsyang.konatoybe.postsWebServer.repository;

import com.konai.hsyang.konatoybe.postsWebServer.domain.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long>, PostsCustomRepository {
}
