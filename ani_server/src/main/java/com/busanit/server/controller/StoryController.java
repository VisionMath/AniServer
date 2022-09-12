package com.busanit.server.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.busanit.server.model.Story;
import com.busanit.server.repository.StoryRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("story")
@RequiredArgsConstructor
public class StoryController {

	private final StoryRepository storyRepository;

	@GetMapping("list")
	public Map<String, List<Story>> getList() {
		Map<String, List<Story>> map = new HashMap<String, List<Story>>();
		map.put("story", storyRepository.findAll());
		return map;
	}
}
