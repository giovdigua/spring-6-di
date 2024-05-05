package com.giovdigua.spring6di.controllers;

import com.giovdigua.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetInjectedControllerTest {

    @Autowired
    SetInjectedController setInjectedController;

    @Test
    void sayHello() {
        System.out.println(setInjectedController.sayHello());
    }
}