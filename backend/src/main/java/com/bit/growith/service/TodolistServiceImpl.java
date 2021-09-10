package com.bit.growith.service;

import com.bit.growith.dao.TodolistRepository;
import com.bit.growith.vo.Todolist;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TodolistServiceImpl implements TodolistService{

    private final TodolistRepository todolistRepository;

    @Override
    public Long create(Todolist todolist) {
        todolistRepository.save(todolist);
        return todolist.getTodolistId();
    }

    @Override
    public Todolist get(Long todolistId) {
        Optional<Todolist> result = todolistRepository.getWithTag(todolistId);
        if(result.isPresent()){
            return result.get();
        }
        return null;
    }

    @Override
    public void modify(Todolist todolist) {
        Optional<Todolist> result = todolistRepository.findById(todolist.getTodolistId());
        if(result.isPresent()){
            todolist = result.get();
            todolist.setTodolistContent(todolist.getTodolistContent());
            todolist.setTodolistDate(todolist.getTodolistDate());
            todolist.setIsCheck(todolist.getIsCheck());
            todolistRepository.save(todolist);
        }
    }

    public void checkTodo(Todolist todolist) {
        Optional<Todolist> result = todolistRepository.findById(todolist.getTodolistId());
        if(result.isPresent()){
            todolist = result.get();
            todolist.setIsCheck(todolist.getIsCheck());
            todolistRepository.save(todolist);
        }
    }

    @Override
    public void delete(Long todolistId) {
        todolistRepository.deleteById(todolistId);
    }

    @Override
    public List<Todolist> getAllWithMemberAndTodolistDate(String tagName, LocalDate todolistDate) {
        List<Todolist> todolists = todolistRepository.getList(tagName, todolistDate);
        return todolists;
    }
}
