package com.gabriell.jwtEstudo.service;

import com.gabriell.jwtEstudo.entities.User;
import com.gabriell.jwtEstudo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repo;

    public User buscarUsuario(User usuario){
        return repo.findByUsername(usuario.getUsername());
    }
}
