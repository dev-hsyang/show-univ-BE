package com.konai.hsyang.konatoybe.indexWebServer.service;

import com.konai.hsyang.konatoybe.loginWebServer.repository.UserRepository;
import com.konai.hsyang.konatoybe.postsWebServer.repository.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class IndexService {

    private final PostsRepository postsRepository;
    private final UserRepository userRepository;
}
