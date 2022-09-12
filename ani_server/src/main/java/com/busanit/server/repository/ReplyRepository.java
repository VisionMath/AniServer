package com.busanit.server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.busanit.server.model.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

    List<Reply> findByDesertion(String desertion);

}
