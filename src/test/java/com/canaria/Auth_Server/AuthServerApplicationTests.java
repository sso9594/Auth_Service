package com.canaria.Auth_Server;

import com.canaria.Auth_Server.service.AuthService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.NoSuchAlgorithmException;

@SpringBootTest
class AuthServerApplicationTests {

	AuthService authService = new AuthService();
	@Test
	void contextLoads() throws NoSuchAlgorithmException {
		String password = "asd";
		System.out.println(authService.encrypt(password));
	}

}
