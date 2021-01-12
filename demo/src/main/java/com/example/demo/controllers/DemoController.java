package com.example.demo.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class DemoController {

    @GetMapping(value = "/testEndPoint")
    @ResponseStatus(OK)
    @ResponseBody
    public String getStatus() {
        return "This is my test controller end point";
    }
}
