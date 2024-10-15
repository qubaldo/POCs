package com.springboot.hibernate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.hibernate.model.Tutorial;

public interface TutorialRepo extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);
}
