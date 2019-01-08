package com.plm.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

/**
 * @author : cwh
 * 2019/1/4 0004
 * description ：C-Cross O-Origin R-Resource S-Sharing
 */
@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter(){
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);//允许cookie跨域
        config.setAllowedHeaders(Arrays.asList(("*")));
        config.setAllowedMethods(Arrays.asList(("*")));
        config.setAllowedOrigins(Arrays.asList(("*")));//http://www/baidu.com
        config.setMaxAge(300L);
        source.registerCorsConfiguration("/**",config);
        return new CorsFilter(source);
    }

}
