package com.anupama.cerp.config;

import com.anupama.cerp.JWTSecurity.JWTAuthenticationEntryPoint;
import com.anupama.cerp.JWTSecurity.JWTAuthenticationFilter;
import com.anupama.cerp.UserDetails.AdminUserDetailsService;
import com.anupama.cerp.UserDetails.StudentUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.security.KeyStore;

@Configuration
public class AppSecurityConfig {

    @Autowired
    private JWTAuthenticationEntryPoint jwtAuthenticationEntryPoint;
    @Autowired
    private JWTAuthenticationFilter jwtAuthenticationFilter;

    @Autowired
    private AdminUserDetailsService adminUserDetailsService;

    @Autowired
    private StudentUserDetailsService studentUserDetailsService;

//    @Bean
//    public UserDetailsService userDetailsService(){
//
//        UserDetails user = User.builder().username("anupama").password(passwordEncoder().encode("abc")).roles("ADMIN").build();
//        return new InMemoryUserDetailsManager(user);
//    }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf(AbstractHttpConfigurer::disable);
        //authorize http req as per public or restricted access
        httpSecurity.authorizeHttpRequests(auth -> auth.requestMatchers("/admins/signin").permitAll()).exceptionHandling(ex -> ex.authenticationEntryPoint(jwtAuthenticationEntryPoint));
        httpSecurity.authorizeHttpRequests(auth -> auth.requestMatchers("/students/signin", "/students/signup").permitAll()).exceptionHandling(ex -> ex.authenticationEntryPoint(jwtAuthenticationEntryPoint));

        httpSecurity.authorizeHttpRequests(auth -> auth.requestMatchers("/admins/**").hasAuthority("ADMIN")).exceptionHandling(ex -> ex.authenticationEntryPoint(jwtAuthenticationEntryPoint));
        httpSecurity.authorizeHttpRequests(auth -> auth.requestMatchers("/students/**").hasAuthority("STUDENT")).exceptionHandling(ex -> ex.authenticationEntryPoint(jwtAuthenticationEntryPoint));

        //configure/add filter
        httpSecurity.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
        return httpSecurity.build();

    }

    @Bean(name = "adminAuthenticationProvider")
    public AuthenticationProvider adminAuthenticationProvider() {
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider(passwordEncoder());
        auth.setUserDetailsService(adminUserDetailsService);
        return auth;
    }

    @Bean(name = "studentAuthenticationProvider")
    public AuthenticationProvider studentAuthenticationProvider() {
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider(passwordEncoder());
        auth.setUserDetailsService(studentUserDetailsService);
        return auth;
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

}
