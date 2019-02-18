package com.c10t.example.sampleapp.service;

import com.c10t.example.sampleapp.vo.HelloResponseVo;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
  public HelloResponseVo greet(long id, String text) {
    return HelloResponseVo.builder().id(id + 100).name("John").message("Hello, " + text).build();
  }
}
