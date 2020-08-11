package org.bhagwan.chap2.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HelloWorld {
    Logger logger = LoggerFactory.getLogger(HelloWorld.class);
    @PostConstruct
    public void sayHello(){
        logger.info("After Construction of object using spring context initializer");
    }
}
