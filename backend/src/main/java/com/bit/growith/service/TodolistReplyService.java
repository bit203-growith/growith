package com.bit.growith.service;

import com.bit.growith.vo.TodolistReply;

public interface TodolistReplyService {
    Object getAllWithTodolist(Long todolistId);

    Long create(TodolistReply reply);
}
