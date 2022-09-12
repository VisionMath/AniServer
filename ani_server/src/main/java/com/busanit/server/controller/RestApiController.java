package com.busanit.server.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.busanit.server.model.User;
import com.busanit.server.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor

public class RestApiController {
	// @Autowired
	private final UserRepository userRepository;

	@GetMapping("home")
	public String home() {
		return "<h1>home</h1>";
	}

	@PostMapping("insert")
	public String insertUser(@RequestBody User user) {

		userRepository.save(user);
		return "데이터 입력 성공";
	}

	@GetMapping("getUsers/{id}")
	public User getUser(@PathVariable("id") Long id) {
		return userRepository.findById(id).get();
	}

	@GetMapping("getUser/{username}")
	public User getUser(@PathVariable("username") String username) {

		return userRepository.findByUsername(username);
	}

	@GetMapping("users")
	public Map<String, List<User>> getList() {
		Map<String, List<User>> map = new HashMap<String, List<User>>();
		map.put("users", userRepository.findAll());
		return map;
	}
}