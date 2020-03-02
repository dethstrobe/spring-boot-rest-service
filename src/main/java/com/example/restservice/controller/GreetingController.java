package com.example.restservice.controller;

import com.example.restservice.model.Greeting;
import com.example.restservice.model.GreetingInput;
import com.example.restservice.service.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
  @Autowired
  private GreetingService greetingService;

  @GetMapping("/greeting")
  public String greeting(@RequestParam(value = "id", defaultValue = "1") String id) {
    return greetingService.findGreeting(Long.parseLong(id));
  }

  @PostMapping("/greeting")
  public Greeting saveGreeting(@RequestBody GreetingInput greeting) {
    return greetingService.saveGreeting(greeting.toString());
  }
}