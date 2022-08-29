package com.busanit.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.busanit.server.model.Story;

@Repository
public interface StoryRepository extends JpaRepository<Story, Long> {

}
