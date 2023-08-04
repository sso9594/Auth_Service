package com.canaria.Auth_Server.controller;

import com.canaria.Auth_Server.dto.RegisterDto;
import com.canaria.Auth_Server.service.AuthService;
import com.canaria.Auth_Server.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
    private final UserService userService;

    @PostMapping
    public ResponseEntity<String> registerUser (@RequestBody RegisterDto registerDto) throws NoSuchAlgorithmException {
        return ResponseEntity
                .ok(userService.register(registerDto));
    }
}
