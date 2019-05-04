package me.ehay.springboot01;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1) // 값이 낮을수록 우선순위가 높음
public class SampleApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments arguments) throws Exception {
        System.out.println("ApplicationRunner foo: " + arguments.containsOption("foo"));
        System.out.println("ApplicationRunner bar: " + arguments.containsOption("bar"));
    }
}
