package com.jag.giflib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class AppConfig {

    public static void main (String [] args){
        System.setProperty("server.port", "8888");
        SpringApplication.run(AppConfig.class,args);
    }
}
