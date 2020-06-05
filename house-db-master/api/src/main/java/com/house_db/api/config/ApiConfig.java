package com.house_db.api.config;

import com.house_db.persistence.config.PersistenceConfig;
import org.h2.server.web.WebServlet;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(
        PersistenceConfig.class
)
@EntityScan(basePackages = {
        "com.house_db.persistence.entities"
})
public class ApiConfig {

    @Bean
    ServletRegistrationBean h2servletRegistration() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }
}
