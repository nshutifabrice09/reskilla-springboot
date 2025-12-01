package rw.reskilla_backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class WebConfig {

    @Bean
    public void addCorsMapping(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:3000", "http://localhost:4200")
                .allowedMethods("GET", "PUT","POST","DELETE","PATCH")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
