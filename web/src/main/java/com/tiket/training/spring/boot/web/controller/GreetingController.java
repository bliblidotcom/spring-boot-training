package com.tiket.training.spring.boot.web.controller;

import com.tiket.training.spring.boot.service.api.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by henry.jonathan on 11/24/2017
 */
@RestController("/greet")
public class GreetingController {

  @Autowired
  private GreetingService greetingService;

  @GetMapping
  public String greet() {
    return greetingService.greet();
  }
}
