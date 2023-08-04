package com.canaria.Auth_Server.repository;

import com.canaria.Auth_Server.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
