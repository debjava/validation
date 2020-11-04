package com.pde.nvt.validation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The Class SwaggerConfig is only for Swagger documentation.
 *
 * @author Debadatta Mishra
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

  /**
   * Provides basic docket api for the application.
   *
   * @return the docket
   */
  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.pde.nvt"))
        .paths(PathSelectors.any())
        .build()
        .apiInfo(apiInfo());
  }

  /**
   * Provides the basic api meta data information.
   *
   * @return the api info
   */
  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("NVT Validations REST API")
        .description("NVT Validation Service a microservice to provide basic NVT information")
        .termsOfServiceUrl("http://springfox.io")
        .contact(
            new Contact(
                "DellEmc", "http://www.dellemc.com/en-us/index.htm", "debadatta.mishra@emc.com"))
        .license("DellEmc NVT Validation Service 0.0.1")
        .licenseUrl(
            "http://www.dell.com/learn/us/en/uscorp1/terms-conditions/art-dell-end-user-license-agreement")
        .version("0.0.1")
        .build();
  }
}
