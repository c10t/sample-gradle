package com.c10t.example.sampleapp.controller;

import java.util.List;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.c10t.example.sampleapp.service.StoryService;
import com.c10t.example.sampleapp.domain.entity.StoryEntity;

@RestController
@RequestMapping("/stories")
@RequiredArgsConstructor
public class StoryController {

  private final StoryService storyService;

  @RequestMapping({"", "/"})
  public List<StoryEntity> findAll() {
    return storyService.findAll();
  }
}
