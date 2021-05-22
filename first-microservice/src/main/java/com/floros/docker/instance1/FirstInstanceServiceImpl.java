package com.floros.docker.instance1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class FirstInstanceServiceImpl implements FirstInstanceService {
    
    @Autowired
    private Environment env;

    @Override
    public String getServiceInstance1() throws Exception {
        String portValue = env.getProperty("server.port");
        String returnValue = "Error";
        if(portValue != null && !portValue.isEmpty()) {
            returnValue = new StringBuilder().append("Hello from First Microservice running on port: ").append(portValue)
                                                                                                       .toString();
        }
        return returnValue;
    }   
}
