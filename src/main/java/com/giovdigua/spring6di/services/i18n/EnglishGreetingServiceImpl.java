package com.giovdigua.spring6di.services.i18n;

import com.giovdigua.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18NService")
public class EnglishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
