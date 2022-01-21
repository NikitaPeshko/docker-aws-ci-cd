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



}
