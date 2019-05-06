package me.ehay.springboot02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by ehay@naver.com on 2019-05-05
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

@Component
public class SampleRunner implements ApplicationRunner {

    @Autowired
    EhayProperties ehayProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=================");
        System.out.println(ehayProperties.getName());
        System.out.println(ehayProperties.getAge());
        System.out.println("=================");
    }
}
