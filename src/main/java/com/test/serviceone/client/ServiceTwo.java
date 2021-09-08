package com.test.serviceone.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "${service.two.name}", url = "${service.two.url}")
public interface ServiceTwo {

    @RequestMapping(method = RequestMethod.GET, value ="/api/hello")
    ResponseEntity<String> getGreeting();
}
