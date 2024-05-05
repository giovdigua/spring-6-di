package com.giovdigua.spring6di.controllers;

import com.giovdigua.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetInjectedControllerTest {

    SetInjectedController setInjectedController;
    @BeforeEach
    void setUp() {
        setInjectedController = new SetInjectedController();
        //Important in setter if forget setting injection we have null pint exception
        setInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(setInjectedController.sayHello());
    }
}