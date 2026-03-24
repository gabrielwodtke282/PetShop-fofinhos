package com.gabriell.jwtEstudo.resources;

import com.gabriell.jwtEstudo.entities.User;
import com.gabriell.jwtEstudo.repositories.UserRepository;
import com.gabriell.jwtEstudo.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/petshop")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/usuarios")
    public List<User> usuarios(@RequestHeader("Authorization") String authHeader) {

        String token = authHeader.replace("Bearer ", "");

        String username = JwtService.extrairUsername(token);
        List<User> users = userRepository.findAll();
        return users;
    }

    @GetMapping(value = "/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        User obj = userRepository.getReferenceById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping(value = "/register")
    public ResponseEntity<User> insertUser(@RequestBody User usuario){
        return ResponseEntity.ok().body(userRepository.save(usuario));
    }
}