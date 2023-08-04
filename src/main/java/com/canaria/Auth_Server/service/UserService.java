package com.canaria.Auth_Server.service;

import com.canaria.Auth_Server.domain.User;
import com.canaria.Auth_Server.dto.RegisterDto;
import com.canaria.Auth_Server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
@RequiredArgsConstructor
public class UserService {

    private final AuthService authService;
    private final UserRepository userRepository;

    // 회원가입시 해당 아이디가 이미 존재하는지에 대한 로직 구현해야함
    public String register (RegisterDto registerDto) throws NoSuchAlgorithmException {
        RegisterDto userdto = RegisterDto.builder()
                .id(registerDto.getId())
                .userid(registerDto.getUserid())
                .pw(authService.encrypt(registerDto.getPw()))
                .useremail(registerDto.getUseremail())
                .username(registerDto.getUsername())
                .build();
        userRepository.save(userdto.toEntity());
        return "회원가입 완료";
    }
}
