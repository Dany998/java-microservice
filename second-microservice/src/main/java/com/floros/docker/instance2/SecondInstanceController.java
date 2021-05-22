package com.floros.docker.instance2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondInstanceController {
    
    SecondInstanceService service;
    
    public SecondInstanceController(@Autowired SecondInstanceService service) {
        this.service = service;
    }
    
    @GetMapping("/microservice2")
    public String getMicroservice() throws Exception {
        return this.service.getServiceInstance1();
    }
}
