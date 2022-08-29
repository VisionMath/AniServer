package com.example.aniserver.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aniserver.model.Story;
import com.example.aniserver.repository.StoryRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class StoryController {

	private final StoryRepository storyRepository;

	@GetMapping("story")
	public Map<String, List<Story>> getList() {
		Map<String, List<Story>> map = new HashMap<String, List<Story>>();
		map.put("story", storyRepository.findAll());
		return map;
	}

}
