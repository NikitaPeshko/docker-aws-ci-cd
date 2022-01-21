package com.epam.cicd;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class Docker {

    @GetMapping
    public String sayDocker(){
        return "Docker hello";
    }
//some comment to check jenkins
    //next temp

    @GetMapping("/hello")
    public String sayDocker11(){
        return "Docker hello hello heloooooo";
    }

    @GetMapping("/hello2")
    public String sayDocker2(){
        return "Docker hello hello heloooooo222";
    }


}
