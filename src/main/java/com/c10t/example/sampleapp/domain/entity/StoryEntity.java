package com.c10t.example.sampleapp.domain.entity;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="story")
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Getter
public class StoryEntity {
  @Id
  @Column(name="sid")
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long sid;

  @Column(name="title")
  private String title;

  @Column(name="score")
  private Integer score;

  @Column(name="insert_at", nullable = false, updatable = false)
  private OffsetDateTime insertAt;

  @Column(name="update_at", nullable = false)
  private OffsetDateTime updateAt;

  @PrePersist
  public void onPrePersist() {
    setInsertAt(OffsetDateTime.now());
    setUpdateAt(OffsetDateTime.now());
  }

  @PreUpdate
  public void onPreUpdate() {
    setUpdateAt(OffsetDateTime.now());
  }
}
