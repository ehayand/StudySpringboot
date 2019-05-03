package me.ehay.springboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        SpringApplication app = new SpringApplication(Application.class);
//        app.run(args);

        new SpringApplicationBuilder()
                .sources(Application.class)
                .run(args);
    }

}
