package com.busanit.server.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Reply {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String content;
	private String email;
	private String desertion;
}
