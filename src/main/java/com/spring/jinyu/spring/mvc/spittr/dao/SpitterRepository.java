package com.spring.jinyu.spring.mvc.spittr.dao;


import com.spring.jinyu.spring.mvc.spittr.bean.Spitter;

public interface SpitterRepository {

  Spitter save(Spitter spitter);
  
  Spitter findByUsername(String username);

}
