package com.c10t.example.sampleapp.vo;

import lombok.Value;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;;

@Value
public class HelloRequestVo {
  private final long id;
  private final String text;

  @JsonCreator
  public HelloRequestVo(
    @JsonProperty("id") long id,
    @JsonProperty("text") String text
  ) {
    this.id = id;
    this.text = text;
  }
}
