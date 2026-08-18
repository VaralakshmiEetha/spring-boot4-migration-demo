package com.javaetmoi.sample.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

import com.javaetmoi.sample.Application;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = Application.class)
@ActiveProfiles("test")
class SpringConfigTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void springConfiguration() {
        assertNotNull(context);
    }
}