package com.tiket.training.spring.boot.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.annotation.Generated;

/**
 * Created by henry.jonathan on 11/24/2017
 */
@Document(collection = "greeting")
public class Greeting {

  @Id
  @Field("_id")
  private Long id;
  private String word;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }
}
