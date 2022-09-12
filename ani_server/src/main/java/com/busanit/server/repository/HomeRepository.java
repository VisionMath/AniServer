package com.busanit.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.busanit.server.model.Home;

public interface HomeRepository extends JpaRepository<Home, Long> {

}
