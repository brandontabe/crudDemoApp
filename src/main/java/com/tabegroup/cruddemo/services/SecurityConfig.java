//package com.tabegroup.cruddemo.services;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.oauth2.jwt.JwtDecoder;
//import org.springframework.security.oauth2.jwt.JwtDecoders;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/employee/retrieveEmployeeById/**").authenticated() // Protect specific API
//                .anyRequest().permitAll()
//                .and()
//                .oauth2ResourceServer()
//                .jwt(); // Use JWT tokens from Azure AD
//        return http.build();
//    }
//
//    @Bean
//    public JwtDecoder jwtDecoder() {
//        return JwtDecoders.fromIssuerLocation("https://login.microsoftonline.com/4658ecba-7811-4068-8e00-7b05d3733f71/v2.0");
//    }
//}
