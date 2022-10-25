package com.konai.hsyang.konatoybe.loginWebApi.domain;

import com.konai.hsyang.konatoybe.loginWebApi.dto.UserUpdateRequestDto;
import com.konai.hsyang.konatoybe.loginWebApi.roles.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;

    @OneToOne
    @JoinColumn(name = "club")
    private Club club;
    private String username;
    private String password;
    private String nickname;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Builder
    public User(Long userID,String userName, String userPw, String userNickname, Club club, Role role){
        this.userID = userID;
        this.username = userName;
        this.password = userPw;
        this.nickname = userNickname;
        this.club = club;
        this.role = role;
    }

    public void updateNickname(UserUpdateRequestDto requestDto){

        this.nickname = requestDto.getNickname();
    }

    public void updatePassword(UserUpdateRequestDto requestDto){

        this.password = requestDto.getNewPassword();
    }
}
