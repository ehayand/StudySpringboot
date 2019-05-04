package me.ehay.springboot01;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class SampleListner {

    public SampleListner(ApplicationArguments arguments) {
        System.out.println("SampleListner foo: " + arguments.containsOption("foo"));
        System.out.println("SampleListner bar: " + arguments.containsOption("bar"));
    }
}
