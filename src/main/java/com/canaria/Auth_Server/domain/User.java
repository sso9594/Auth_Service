package com.canaria.Auth_Server.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String userid;
    @Column
    private String pw;
    @Column
    private String username;
    @Column
    private String useremail;

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", pw='" + pw + '\'' +
                ", username='" + username + '\'' +
                ", useremail='" + useremail + '\'' +
                '}';
    }

    @Builder
    public User(Long id, String userid, String pw, String username, String useremail) {
        this.id = id;
        this.userid = userid;
        this.pw = pw;
        this.username = username;
        this.useremail = useremail;
    }
}
