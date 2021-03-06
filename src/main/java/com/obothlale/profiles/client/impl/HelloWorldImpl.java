package com.obothlale.profiles.client.impl;

import com.obothlale.profiles.client.HelloWorld;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorld {
    @Value("${message}")
    private String message;

    public String greetings() {
        String output = "Hello: " + message;
        System.out.println(output);
        return output;
    }
}
