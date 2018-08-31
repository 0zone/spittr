package com.spring.jinyu.spring.mvc.spittr.dao;


import com.spring.jinyu.spring.mvc.spittr.bean.Spittle;

import java.util.List;

public interface SpittleRepository {

  List<Spittle> findRecentSpittles();

  List<Spittle> findSpittles(long max, int count);
  
  Spittle findOne(long id);

  void save(Spittle spittle);

}
