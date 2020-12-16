package ru.vniims.test_teamcity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Application {

    private static final String MODULE_NAME = "test_teamcity";

    public static String getModuleName() {
        return MODULE_NAME;
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
