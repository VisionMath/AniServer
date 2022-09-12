package com.busanit.server.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.busanit.server.model.Home;
import com.busanit.server.repository.HomeRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("home")
@RequiredArgsConstructor

public class HomeController {

    private final HomeRepository homeRepository;

    @GetMapping("list")
	public Map<String, List<Home>> getHomeList() {
	    Map<String, List<Home>> map = new HashMap<String, List<Home>>();
	    map.put("homes", homeRepository.findAll());
	    return map;
	}
}