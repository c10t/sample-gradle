package com.c10t.example.sampleapp.controller;

import lombok.Builder;
import lombok.Value;

import com.fasterxml.jackson.annotation.JsonProperty;

@Value
@Builder
public class BulkInsertResponseVo {
  @JsonProperty("result")
  private final String result;
}
