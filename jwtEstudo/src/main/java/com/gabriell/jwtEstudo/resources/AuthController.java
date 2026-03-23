package com.gabriell.jwtEstudo.resources;

import com.gabriell.jwtEstudo.entities.User;
import com.gabriell.jwtEstudo.service.JwtService;
import com.gabriell.jwtEstudo.service.UserService;
import com.gabriell.jwtEstudo.service.simulador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class AuthController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody User usuario) {
        User usercompleto = userService.buscarUsuario(usuario);
        if (usercompleto != null) {
            System.out.println(usercompleto.getRole());
            String token = JwtService.gerarToken(usercompleto);
            return Map.of("token", token);
        }
        return Map.of("erro", "login invalido");
    }
}