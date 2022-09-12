package com.busanit.server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.busanit.server.model.Shelter;

@Repository
public interface ShelterRepository extends JpaRepository<Shelter, Long> {
    List<Shelter> findByUprNm(String uprNm);
}
