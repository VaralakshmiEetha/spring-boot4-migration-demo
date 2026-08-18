package com.javaetmoi.sample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import com.javaetmoi.sample.config.MainConfig;
import com.javaetmoi.sample.config.WebMvcConfig;
@SpringBootApplication
@Import({ MainConfig.class, WebMvcConfig.class })
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}