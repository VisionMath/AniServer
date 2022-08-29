package com.example.aniserver.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.aniserver.model.Story;

import lombok.extern.slf4j.Slf4j;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class StoryRepositoryTest {

	@Autowired
	StoryRepository storyRepository;
	
//	@Test
//	public void test() {
//		log.info(storyRepository.);
//	}
	
	@Test
	public void test() {
		log.info(storyRepository.selectAll().toString());
	}

}
