package com.busanit.server.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.busanit.server.model.Reply;
import com.busanit.server.repository.ReplyRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("reply")
@RequiredArgsConstructor

public class ReplyController {
	private final ReplyRepository replyRepository;

	@PostMapping("insert")
	public void insertUser(@RequestBody Reply reply) {
	    replyRepository.save(reply);
	}

	@GetMapping("list")
	public Map<String, List<Reply>> getList(String desertion) {
	    Map<String, List<Reply>> map = new HashMap<String, List<Reply>>();
	    map.put("replys", replyRepository.findByDesertion(desertion));
		return map;
	}
}