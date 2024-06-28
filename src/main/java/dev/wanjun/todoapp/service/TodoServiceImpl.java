package dev.wanjun.todoapp.service;

import dev.wanjun.todoapp.dao.TodoRepository;
import dev.wanjun.todoapp.domain.Todo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    @Resource
    private TodoRepository
            todoRepository;
    @Override
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @Override
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public Todo updateTodo(Long id, Todo updatedTodo) {
        return null;
    }

    @Override
    public void deleteTodo(Long id) {

    }
}
