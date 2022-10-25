package com.konai.hsyang.konatoybe.indexWebApi.service;

import com.konai.hsyang.konatoybe.loginWebApi.repository.UserRepository;
import com.konai.hsyang.konatoybe.postsWebApi.repository.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class IndexService {

    private final PostsRepository postsRepository;
    private final UserRepository userRepository;
}
