package com.lvksz.employeecrud.security;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

//    @Bean
//    public UserDetailsManager userDetailsManager(DataSource dataSource){
//        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
//
//        jdbcUserDetailsManager.setUsersByUsernameQuery(
//                "SELECT user_id, pw, active FROM members WHERE user_id = ?");
//
//        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
//                "SELECT user_id, role FROM roles WHERE user_id = ?");
//
//        return jdbcUserDetailsManager;
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//        http.authorizeHttpRequests(configurer ->
//                configurer
//                        .requestMatchers(HttpMethod.GET, "api/employee").hasRole("EMPLOYEE")
//                        .requestMatchers(HttpMethod.GET, "api/employee/**").hasRole("EMPLOYEE")
//                        .requestMatchers(HttpMethod.PUT, "api/employee").hasRole("MANAGER")
//                        .requestMatchers(HttpMethod.POST, "api/employee").hasRole("MANAGER")
//                        .requestMatchers(HttpMethod.DELETE, "api/employee/**").hasRole("ADMIN")
//        );
//
//        http.httpBasic(Customizer.withDefaults());
//
//        http.csrf(csrf -> csrf.disable());
//
//        return http.build();
//    }

//    @Bean
//    public InMemoryUserDetailsManager userDetailsManager(){
//
//        UserDetails lukas = User.builder()
//                .username("Lukas")
//                .password("{noop}test123")
//                .roles("EMPLOYEE")
//                .build();
//
//        UserDetails jakub = User.builder()
//                .username("Jakub")
//                .password("{noop}test123")
//                .roles("EMPLOYEE", "MANAGER")
//                .build();
//
//        UserDetails dawid = User.builder()
//                .username("Dawid")
//                .password("{noop}test123")
//                .roles("EMPLOYEE", "MANAGER", "ADMIN")
//                .build();
//
//        return new InMemoryUserDetailsManager(lukas, jakub, dawid);
//    }
}
