package com.c10t.example.sampleapp.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.c10t.example.sampleapp.domain.entity.StoryEntity;

@Repository
public interface StoryRepository extends JpaRepository<StoryEntity, Long> {}
