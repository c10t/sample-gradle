package com.c10t.example.sampleapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import com.c10t.example.sampleapp.domain.entity.StoryEntity;
import com.c10t.example.sampleapp.domain.repository.StoryRepository;


@Service
@RequiredArgsConstructor
public class StoryService {

  private final StoryRepository repo;

  public List<StoryEntity> findAll() {
    return repo.findAll();
  }
}
