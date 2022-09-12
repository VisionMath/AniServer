package com.busanit.server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.busanit.server.model.District;

@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {
    List<District> findByUprNm(String uprNm);
}
