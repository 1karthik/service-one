package com.test.serviceone.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "${service.three.name}", url = "${service.three.url}")
public interface ServiceThree {

    @RequestMapping(method = RequestMethod.POST, value ="/api/user/details")
    ResponseEntity<String> userDetails(@RequestBody Object data);
}
