package me.ehay.springboot02;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by ehay@naver.com on 2019-05-06
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

@Component
@ConfigurationProperties("ehay")
public class EhayProperties {

    private String name;

    private int age;

    private String fullName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
