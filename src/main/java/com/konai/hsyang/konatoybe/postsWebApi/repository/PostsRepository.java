package com.konai.hsyang.konatoybe.postsWebApi.repository;

import com.konai.hsyang.konatoybe.postsWebApi.domain.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long>, PostsCustomRepository {
}
