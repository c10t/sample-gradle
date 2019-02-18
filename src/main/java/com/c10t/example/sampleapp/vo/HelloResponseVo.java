package com.c10t.example.sampleapp.vo;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class HelloResponseVo {
  private final long id;
  private final String name;
  private final String message;
}
