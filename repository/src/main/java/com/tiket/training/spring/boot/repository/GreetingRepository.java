package com.tiket.training.spring.boot.repository;

import com.tiket.training.spring.boot.entity.Greeting;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by henry.jonathan on 11/24/2017
 */
public interface GreetingRepository
    extends MongoRepository<Greeting, Long>, GreetingRepositoryCustom {
}
