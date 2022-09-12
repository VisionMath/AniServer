package com.busanit.server.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.busanit.server.model.District;
import com.busanit.server.model.Shelter;
import com.busanit.server.repository.DistrictRepository;
import com.busanit.server.repository.ShelterRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("shelter")
@RequiredArgsConstructor

public class ShelterController {

    private final ShelterRepository shelterRepository;
    private final DistrictRepository districtRepository;

    @GetMapping("list")
    public Map<String, List<Shelter>> getList() {
	Map<String, List<Shelter>> map = new HashMap<String, List<Shelter>>();
	map.put("shelter", shelterRepository.findAll());
	return map;
    }
    
    @GetMapping("getShelter")
    public Map<String, List<Shelter>> getShelter(@RequestParam("uprNm") String uprNm) {
	Map<String, List<Shelter>> map = new HashMap<String, List<Shelter>>();
	map.put("shelter", shelterRepository.findByUprNm(uprNm));
	return map;
    }

    @GetMapping("districtList")
    public Map<String, List<District>> getDistrictList() {
	Map<String, List<District>> map = new HashMap<String, List<District>>();
	map.put("district", districtRepository.findAll());
	return map;
    }

    @GetMapping("getDistrict")
    public Map<String, List<District>> getDistrict(@RequestParam("uprNm") String uprNm) {
	Map<String, List<District>> map = new HashMap<String, List<District>>();
	map.put("district", districtRepository.findByUprNm(uprNm));
	return map;
    }
}
