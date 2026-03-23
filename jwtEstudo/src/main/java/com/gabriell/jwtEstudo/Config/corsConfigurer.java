package com.gabriell.jwtEstudo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class corsConfigurer {

    @Bean
    public WebMvcConfigurer corsConfigurert() {
        return new WebMvcConfigurer() {

            @Override
            public void addCorsMappings(CorsRegistry registry) {

                registry.addMapping("/login") // endpoint que será liberado
                        .allowedOrigins("http://127.0.0.1:5500") // quem pode acessar
                        .allowedMethods("POST") // quais métodos
                        .allowedHeaders("Content-Type"); // quais headers
            }
        };
    }
}