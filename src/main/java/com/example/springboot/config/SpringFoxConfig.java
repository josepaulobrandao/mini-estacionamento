package com.example.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SpringFoxConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
    public ApiInfo apiInfo () {
        return  new ApiInfo(
                "My REST API",
                "Service API - Parking System.",
                "API TOS",
                "Terms of service",
                new Contact("José Paulo", "https://github.com/josepaulobrandao/parking-system", "jose.dev2301@gmail.com"),
                "License of API", "http://springfox.io", Collections.emptyList());

    }

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/myproject", "/swagger-ui-custom.html");
    }
}
