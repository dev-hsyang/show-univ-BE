package com.konai.hsyang.konatoybe.index.service;

import com.konai.hsyang.konatoybe.login.repository.UserRepository;
import com.konai.hsyang.konatoybe.posts.repository.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class IndexService {

    private final PostsRepository postsRepository;
    private final UserRepository userRepository;
}
