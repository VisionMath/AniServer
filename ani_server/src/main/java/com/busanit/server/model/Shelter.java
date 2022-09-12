package com.busanit.server.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Shelter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String careRegNo;
	private String careNm;
	private String uprCd;
	private String orgCd;
	private String orgNm;
	private String uprNm;
}
