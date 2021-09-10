package com.bit.growith.dao;

import com.bit.growith.vo.Todolist;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface TodolistRepository extends JpaRepository<Todolist, Long> {

    @EntityGraph(attributePaths = "tagId", type = EntityGraph.EntityGraphType.LOAD)
    @Query("select td from Todolist td where td.todolistId = :todolistId")
    Optional<Todolist> getWithTag(Long todolistId);

    @EntityGraph(attributePaths = {"tagId"}, type = EntityGraph.EntityGraphType.LOAD)
    @Query("select td from Todolist td where td.tag.tagName = :tagName and td.todolistDate = :todolistDate")
    List<Todolist> getList(String tagName, LocalDate todolistDate);

}
