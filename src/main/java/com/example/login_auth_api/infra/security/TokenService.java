package com.example.login_auth_api.infra.security;

import org.springframework.stereotype.Service;

import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.example.login_auth_api.LoginAuthApiApplication;
import com.example.login_auth_api.domain.user.User;

import com.auth0.jwt.JWT;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.beans.factory.annotation.Value;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;


@Service
public class TokenService {

    private final LoginAuthApiApplication loginAuthApiApplication;
    @Value("${api.security.token.secret}")
    private String secret;

    TokenService(LoginAuthApiApplication loginAuthApiApplication) {
        this.loginAuthApiApplication = loginAuthApiApplication;
    }

    public String generateToken (User user){
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            String token = JWT.create()
                        .withIssuer("login-auth-api")
                        .withSubject(user.getEmail())
                        .withExpiresAt(this.generateExpirationDate())
                        .sign(algorithm);
            return token;
        } catch (JWTCreationException exception) {
            throw new RuntimeException("Error while authenticating user");
        }
    }

    public String validateToken(String token){
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.require(algorithm)
                    .withIssuer("login-auth-api")
                    .build()
                    .verify(token)
                    .getSubject();
        } catch (JWTVerificationException exception) {
            return null;
        }
    }

    private Instant generateExpirationDate(){
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    }
}
