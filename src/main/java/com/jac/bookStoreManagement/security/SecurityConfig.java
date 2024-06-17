package com.jac.bookStoreManagement.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	@Bean
	public UserDetailsManager userDetailsManager(DataSource dataSource) {
		return new JdbcUserDetailsManager(dataSource);
	}
	
	
	
	@SuppressWarnings("removal")
	@Bean

	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(configurer ->

                configurer
                		.requestMatchers("/").hasAnyRole("CUSTOMER","ADMIN")
                		.requestMatchers("/admin/**").hasRole("ADMIN")
                		.requestMatchers("/actuator/**").hasRole("ADMIN")
                        .anyRequest().authenticated()

        )
        
        .formLogin(form ->

                form

                        .loginPage("/login")

                        .loginProcessingUrl(("/authenticateTheUser"))

                        .permitAll()

        ).logout(logout -> logout.permitAll())
        .exceptionHandling(configurer -> configurer.accessDeniedPage("/access-denied")
        );

		return http.build();

	}

}
