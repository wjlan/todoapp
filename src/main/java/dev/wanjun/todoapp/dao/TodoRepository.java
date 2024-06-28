package dev.wanjun.todoapp.dao;

import dev.wanjun.todoapp.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoRepository extends JpaRepository<Todo, Long> {
}
