package com.imranrauf.yulfaha;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Imran Rauf Created on 21-Oct-2019
 */
// @Configuration
// @EnableSwagger2
public class Swagger2Configuration {

//     @Bean
//     public Docket documentation() {
//         return new Docket(DocumentationType.SWAGGER_2)
//             .select()
//             .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
//             .paths(PathSelectors.any())
//             .build();
//     }

}
