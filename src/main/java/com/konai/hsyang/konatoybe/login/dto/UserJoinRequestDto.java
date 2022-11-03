package com.konai.hsyang.konatoybe.login.dto;

import com.konai.hsyang.konatoybe.login.domain.Club;
import com.konai.hsyang.konatoybe.login.domain.User;
import com.konai.hsyang.konatoybe.login.roles.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserJoinRequestDto {

    private Club clubID;
    private String username;
    private String password;
    private String nickname;
    private Role role;

    @Builder
    public UserJoinRequestDto(Club club, String userName, String userPw, String userNickName) {
        this.clubID = club;
        this.username = userName;
        this.password = userPw;
        this.nickname = userNickName;
    }

    public User toEntity(){
        return User.builder()
                .club(clubID)
                .userName(username)
                .userPw(password)
                .userNickname(nickname)
                .role(role)
                .build();
    }

    public void setEncPassword(String encPassword){
        this.password = encPassword;
    }
    public void setRole(Role role){
        this.role = role;
    }
    public void setClubID(Club club){
        this.clubID = club;
    }
}
