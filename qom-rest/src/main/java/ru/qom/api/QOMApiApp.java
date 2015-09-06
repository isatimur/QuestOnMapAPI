package ru.qom.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QOMApiApp {

    private static final Logger log = LoggerFactory.getLogger(QOMApiApp.class);

    public static void main(String[] args) {
        SpringApplication.run(QOMApiApp.class, args);
    }

}














