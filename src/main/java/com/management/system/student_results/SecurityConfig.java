package com.management.system.student_results;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

@Configuration
public class SecurityConfig {

    /*@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        //1: Response to preflight request doesn't pass access control check
        //2: basic auth
        return
                http
                        .authorizeHttpRequests(
                                auth ->
                                        auth
                                                .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                                                .anyRequest().authenticated()
                        )
                        .httpBasic(Customizer.withDefaults())
                        .sessionManagement(
                                session -> session.sessionCreationPolicy
                                        (SessionCreationPolicy.STATELESS))
                        .csrf().disable()
                        .build();
    }*/

}