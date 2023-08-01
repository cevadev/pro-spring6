package com.ceva.prospring6.three.constructor;

import org.springframework.stereotype.Component;

// simple bean sin dependencias
@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider{
    @Override
    public String getMessage() {
        return "Hello cruel world";
    }
}
