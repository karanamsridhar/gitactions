package com.cicd.gitactions.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/actions")
public class GitActions {

    @GetMapping(value = "/status")
    public String checkStatus(){
        return "Git actions is working fine !!";
    }

}
