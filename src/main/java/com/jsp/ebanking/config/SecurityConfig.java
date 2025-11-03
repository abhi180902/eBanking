package com.jsp.ebanking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	private String[] SwaggerPaths = {"/v3/api-docs/**", "/swagger-ui.html", "/swagger-ui/**", "/webjars/**"};
	
	
//	SecurityFilterChain is a core component in Spring Security that defines the chain of filters applied to incoming HTTP requests to handle authentication, authorization, and security rules.
//	To protect specific URLs/endpoints,	To configure login methods (form login, JWT, OAuth2 etc.)
//	To allow/deny access based on roles, To disable/enable security features (e.g., CSRF)
	@Bean
	SecurityFilterChain security(HttpSecurity httpSecurity) throws Exception{
		return httpSecurity
				.authorizeHttpRequests(x->x.requestMatchers(SwaggerPaths).permitAll().requestMatchers("/api/v1/auth/**").permitAll().anyRequest().authenticated())
				.formLogin(x->x.disable())
				.httpBasic(x->x.disable())
				.csrf(x->x.disable())
				.build();
	}
	
}
