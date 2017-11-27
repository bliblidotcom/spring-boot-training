package com.tiket.training.spring.boot.service.impl;


import com.tiket.training.spring.boot.entity.Greeting;
import com.tiket.training.spring.boot.repository.GreetingRepository;
import com.tiket.training.spring.boot.service.api.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by henry.jonathan on 11/24/2017
 */
@Service
public class GreetingServiceImpl implements GreetingService {

  @Autowired
  private GreetingRepository greetingRepository;

  @Override
  public String greet() {
    //    Greeting greeting = greetingRepository.findOne(1L);
    //    return greeting == null ? null : greeting.getWord();
    greetingRepository.insertDefaultData();

    return "Cobain init default data";
  }
}
