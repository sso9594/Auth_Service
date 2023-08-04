package com.canaria.Auth_Server.dto;

import com.canaria.Auth_Server.domain.User;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class RegisterDto {

    private Long id;
    private String userid;
    private String pw;
    private String username;
    private String useremail;

    @Builder
    public RegisterDto(Long id, String userid, String pw, String username, String useremail) {
        this.id = id;
        this.userid = userid;
        this.pw = pw;
        this.username = username;
        this.useremail = useremail;
    }

    public User toEntity(){
        return User.builder()
                .id(id)
                .userid(userid)
                .pw(pw)
                .useremail(useremail)
                .username(username)
                .build();
    }
}
