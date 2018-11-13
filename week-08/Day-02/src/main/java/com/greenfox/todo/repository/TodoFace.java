package com.greenfox.todo.repository;

import com.greenfox.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;



public interface TodoFace extends CrudRepository<Todo, Long> {



}
