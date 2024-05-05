package com.giovdigua.spring6di.controllers;

import com.giovdigua.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetInjectedController {


    private GreetingService greetingService;

    @Qualifier("setterGreetingBean")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("SetInjectedController.setGreetingService");
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return  greetingService.sayGreeting();
    }
}
