package com.pfproject.api.config;

import javax.swing.text.html.HTMLEditorKit.LinkController;

import com.pfproject.api.security.filter.AuthenticationTokenFilter;
import com.pfproject.api.security.service.TokenAuthenticationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import org.apache.log4j.Logger;

@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
// @EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {
    @Configuration
    @Order(1)
    public static class SecurityConfigg extends WebSecurityConfigurerAdapter {

        private final TokenAuthenticationService tokenAuthenticationService;
        static Logger log = Logger.getLogger(SecurityConfig.class.getName());

        @Autowired
        protected SecurityConfigg(final TokenAuthenticationService tokenAuthenticationService) {
            super();
            this.tokenAuthenticationService = tokenAuthenticationService;
        }

        @Override
        protected void configure(final HttpSecurity http) throws Exception {
            http.authorizeRequests().antMatchers("/api/user/auth").permitAll().antMatchers("/api/user/signup")
                    .permitAll().anyRequest().authenticated().and()
                    .addFilterBefore(new AuthenticationTokenFilter(tokenAuthenticationService),
                            UsernamePasswordAuthenticationFilter.class)
                    .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().csrf().disable();

        }
    }

    @Configuration
    @Order(2)
    public static class ApiWebSecurityConfigurationAdapter extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {

        }
    }

}
