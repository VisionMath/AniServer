package com.example.aniserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aniserver.model.Story;

@Repository
public interface StoryRepository extends JpaRepository<Story, Long> {

//	@Query(value = "select id, convert(title using utf8mb4), convert(content using utf8mb4), link from story", nativeQuery = true)
//	public List<Story> selectAll();

//		public List<Story> findAll() {
//			return em.createQuery("select id, convert(title using utf8mb4), convert(content using utf8mb4), link from story")
//		}

}
