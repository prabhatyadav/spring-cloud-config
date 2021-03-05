
package com.example.configCommonClientApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic/")
public class BasicRestController {

    @Autowired
    private Environment environment;

    @Value("${application.user.name}")
    private String username;

    @Value("${application.user.password}")
    private String password;

    @GetMapping("/user")
    public String getUserDetails(){
        return "Hello Prabhat";
    }

    @GetMapping("/user/usingValue")
    public String getUserDetailsByValue(){
        return "Hello" +this.username +" : "+this.password;
    }

    @GetMapping("/user/environment")
    public String getUserDetailsByEnvironment(){
        return "Hello " +environment.getProperty("application.user.name")
                + " : "+environment.getProperty("application.user.password");
    }
}
