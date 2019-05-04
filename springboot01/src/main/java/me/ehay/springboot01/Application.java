package me.ehay.springboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);

        app.addListeners(new StartingListener()); // 이런식으로 사용하면 StartingListener는 Bean에 등록될 필요가 없음.

        app.setWebApplicationType(WebApplicationType.NONE);

        app.run(args);

//        new SpringApplicationBuilder()
//                .sources(Application.class)
//                .run(args);
    }

}
