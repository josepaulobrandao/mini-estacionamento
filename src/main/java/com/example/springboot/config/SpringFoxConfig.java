package com.example.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

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
    private ApiInfo apiInfo () {
        return  new ApiInfoBuilder()
                .title("API")
                .description("Service API - Parking System")
                .termsOfServiceUrl("http://springfox.io")
                .contact(new Contact("springfox",
                                     "https://github.com/josepaulobrandao/parking-system",
                                     "jose.dev2301@gmailcom"))
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/josepaulobrandao/parking-system")
                .version("2.0")
                .build();
    }
}
