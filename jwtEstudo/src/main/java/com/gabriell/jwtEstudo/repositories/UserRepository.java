package com.gabriell.jwtEstudo.repositories;

import com.gabriell.jwtEstudo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
