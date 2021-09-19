package com.budgetplan.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

//  customization of autoconfiguration
@Configuration
public class Config {

    @Bean
    public Docket swaggerApi() {
        return new Docket(DocumentationType. SWAGGER_2 )
                .select()
//                pathRegex - default error controller excluded
                .paths(PathSelectors. regex ( "^(?!/(error).*$).*$" ))
                .build();
    }

}
