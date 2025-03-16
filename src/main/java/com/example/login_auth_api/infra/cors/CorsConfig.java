package com.example.login_auth_api.infra.cors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.addAllowedOrigin("http://localhost:4200"); // Permite apenas a origem do frontend
        configuration.addAllowedMethod("GET"); // Permite o método GET
        configuration.addAllowedMethod("POST"); // Permite o método POST
        configuration.addAllowedHeader("*"); // Permite qualquer cabeçalho
        configuration.setAllowCredentials(true); // Permite o envio de credenciais (cookies)

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);  // Aplica a configuração a todos os endpoints
        return source;
    }
}
