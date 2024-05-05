package com.giovdigua.spring6di.controllers;

import com.giovdigua.spring6di.services.GreetingService;

public class SetInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return  greetingService.sayGreeting();
    }
}
