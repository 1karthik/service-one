package com.test.serviceone.controller;


import com.test.serviceone.client.ServiceThree;
import com.test.serviceone.client.ServiceTwo;
import com.test.serviceone.component.HealthCheckIndicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MainController {


    @Autowired
    ServiceTwo serviceTwo;

    @Autowired
    ServiceThree serviceThree;

    @Autowired
    HealthCheckIndicator healthCheckIndicator;

    @GetMapping("/service/status")
    public Health isServiceUp() {
        return healthCheckIndicator.health();
    }

    @PostMapping("/welcome/user")
    public String getConcatenatedResponses(@RequestBody Object data) {
        return serviceTwo.getGreeting().getBody() + " " + serviceThree.userDetails(data).getBody();
    }
}
