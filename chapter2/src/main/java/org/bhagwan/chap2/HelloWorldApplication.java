package org.bhagwan.chap2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {
    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(HelloWorldApplication.class);

    }
}
