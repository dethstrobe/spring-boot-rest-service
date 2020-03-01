package com.example.restservice.service;

import com.example.restservice.model.Greeting;
import com.example.restservice.repository.GreetingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
  @Autowired
  private GreetingRepository greetingRepository;

  public String findGreeting(long id) {
    return greetingRepository.findById(id).map(greeting -> greeting.getContent()).orElse("Hello World");
  }

  public Greeting saveGreeting(String content) {
    return greetingRepository.save(new Greeting(content));
  }
}
