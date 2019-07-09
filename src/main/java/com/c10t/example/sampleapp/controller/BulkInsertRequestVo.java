package com.c10t.example.sampleapp.controller;

import lombok.Value;

import java.util.List;

import com.c10t.example.sampleapp.domain.entity.StoryEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

@Value
public class BulkInsertRequestVo {
  @JsonProperty("stories")
  private final List<StoryEntity> stories;
}
