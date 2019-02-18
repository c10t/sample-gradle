package com.c10t.example.sampleapp.controller;

import com.c10t.example.sampleapp.service.HelloService;
import com.c10t.example.sampleapp.vo.HelloRequestVo;
import com.c10t.example.sampleapp.vo.HelloResponseVo;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HelloController {
  private final HelloService helloService;

  @RequestMapping({"", "/"})
  public String index() {
    return "<h1>Hello, World!</h1>";
  }

  @RequestMapping("/world/{name}")
  public HelloResponseVo helloWorld(@PathVariable String name) {
    return helloService.greet(0, name);
  }

  @RequestMapping(path="/message", method=RequestMethod.POST)
  public HelloResponseVo message(@RequestBody HelloRequestVo req) {
    return helloService.greet(req.getId(), req.getText());
  }
}
