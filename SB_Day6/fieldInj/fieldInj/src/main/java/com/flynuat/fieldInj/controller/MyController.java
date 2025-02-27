package com.flynuat.fieldInj.controller;

import com.flynuat.fieldInj.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired                     //Field Injection
    private MyService myService;

    @GetMapping("/message")
    public String getMessage(){
        return myService.getMessage();
    }
}
