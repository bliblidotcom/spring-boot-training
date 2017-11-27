package com.tiket.training.spring.boot.repository;

import com.tiket.training.spring.boot.entity.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Created by henry.jonathan on 11/24/2017
 */
public class GreetingRepositoryImpl implements GreetingRepositoryCustom {

  @Autowired
  private MongoTemplate mongoTemplate;

  @Override
  public void insertDefaultData() {

    Greeting greeting = new Greeting();
    greeting.setId(2L);
    greeting.setWord("Ini data default");

    Greeting greeting1 = new Greeting();
    greeting1.setId(3L);
    greeting1.setWord("Ini data default lain");

    mongoTemplate.save(greeting);
    mongoTemplate.save(greeting1);
  }
}
