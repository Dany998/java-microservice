package com.floros.docker.instance1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstInstanceController {
    
    FirstInstanceService service;
    
    public FirstInstanceController(@Autowired FirstInstanceService service) {
        this.service = service;
    }
    
    @GetMapping("/microservice1")
    public String getMicroservice() throws Exception {
        return this.service.getServiceInstance1();
    }
}
