package com.konai.hsyang.konatoybe.loginWebApi.service;

import com.konai.hsyang.konatoybe.exceptions.NoClubFoundException;
import com.konai.hsyang.konatoybe.loginWebApi.dto.UserJoinRequestDto;
import com.konai.hsyang.konatoybe.loginWebApi.repository.ClubRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ClubService {

    private final ClubRepository clubRepository;

    public void setClub(String club, UserJoinRequestDto requestDto){

        Long clubNo;
        switch (club){
            case "c1": clubNo=1L;
                break;
            case "c2": clubNo=2L;
                break;
            case "c3": clubNo=3L;
                break;
            case "c4": clubNo=4L;
                break;
            case "c5": clubNo=5L;
                break;
            case "c6": clubNo=6L;
                break;
            default: clubNo=null;
        }
        requestDto.setClubID(clubRepository.findById(clubNo).orElseThrow(() -> new NoClubFoundException()));
    }
}
