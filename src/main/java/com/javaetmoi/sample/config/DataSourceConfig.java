package com.javaetmoi.sample.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

/**
 * DataSource configuration.
 *
 * Note: the original JNDI-based lookup for the "javaee" profile has been removed
 * since the app now runs standalone via Spring Boot's embedded Tomcat (no JNDI
 * environment is available outside a full app server). Boot auto-configures an
 * embedded H2 DataSource for local/dev use instead.
 */
@Configuration
@PropertySource({ "classpath:com/javaetmoi/sample/config/datasource.properties" })
public class DataSourceConfig {

    @Bean
    @Profile("test")
    public DataSource testDataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
    }
}