package com.ceva.spring6.three.annotated;

import com.ceva.spring6.three.decoupled.HelloWorldMProvider;
import com.ceva.spring6.three.decoupled.MProvider;
import com.ceva.spring6.three.decoupled.MRender;
import com.ceva.spring6.three.decoupled.StandardOutMessageRender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public MProvider provider(){
        return new HelloWorldMProvider();
    }

    @Bean
    public MRender renderer(){
        MRender render = new StandardOutMessageRender();
        render.setMessageProvider(provider());
        return render;
    }
}
