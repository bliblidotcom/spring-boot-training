package com.tiket.training.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by henry.jonathan on 11/24/2017
 */
@SpringBootApplication
@EnableMongoRepositories
public class Main {
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }
}
