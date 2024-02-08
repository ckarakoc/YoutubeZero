package com.example.youtubezero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YoutubeZeroApplication {
    // todo: 1:07:52
    public static void main(String[] args) {
        var ctx = SpringApplication.run(YoutubeZeroApplication.class, args);

        MyFirstClass myFirstClass = ctx.getBean(MyFirstClass.class);
        System.out.println(myFirstClass.sayHello());
    }
}
