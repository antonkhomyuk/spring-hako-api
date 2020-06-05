package com.house_db.persistence.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {
        "com.house_db.persistence"
})
@EnableJpaRepositories(basePackages = {
        "com.house_db.persistence.repositories"
})
public class PersistenceConfig {
}
