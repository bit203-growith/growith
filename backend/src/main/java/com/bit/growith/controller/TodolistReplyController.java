package com.bit.growith.controller;

import com.bit.growith.service.TodolistReplyService;
import com.bit.growith.vo.TodolistReply;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todoReply")
@RequiredArgsConstructor
public class TodolistReplyController {
//목록 보기
    //등록, 수정 삭제
    private final TodolistReplyService todolistReplyService;

    //조회...인데 투두로 옮기기
    @GetMapping(value = "/")
    public ResponseEntity<?> getTodoReply(Long todolistId) {

        return new ResponseEntity<>(todolistReplyService.getAllWithTodolist(todolistId), HttpStatus.OK);
    }

    //등록
    @PostMapping(value = "/")
    public ResponseEntity<?> createTodoReply(@RequestBody TodolistReply reply) {
        Long todolistReplyId = todolistReplyService.create(reply);
        return new ResponseEntity<>(todolistReplyId, HttpStatus.OK);
    }

//    @PutMapping(value = "/")
}
