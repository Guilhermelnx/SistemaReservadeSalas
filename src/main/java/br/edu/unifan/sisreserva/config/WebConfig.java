package br.edu.unifan.sisreserva.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Libera absolutamente todos os seus endpoints (/usuarios, /espacos, /reservas)
                .allowedOrigins("*") // Libera qualquer porta de Front-end para acessar
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT")
                .allowedHeaders("*"); // Libera o envio de JSON
    }
}