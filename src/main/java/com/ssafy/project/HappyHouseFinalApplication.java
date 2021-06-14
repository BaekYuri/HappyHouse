package com.ssafy.project;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ssafy.project.interceptor.JwtInterceptor;

@SpringBootApplication
public class HappyHouseFinalApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(HappyHouseFinalApplication.class, args);
	}

	@Autowired
	private JwtInterceptor jwtInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(jwtInterceptor).addPathPatterns("/User/**")
		.excludePathPatterns(Arrays.asList("/User/join", "/User/login"));
		
	}
	
	
	/**
	 * 전역 cross origin
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedOrigins("*")
		.allowedMethods("*")
		.allowedHeaders("*")
		.exposedHeaders("access-token");
	}
}
