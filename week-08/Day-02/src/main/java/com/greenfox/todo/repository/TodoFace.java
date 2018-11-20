package com.greenfox.todo.repository;
import com.greenfox.todo.model.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface TodoFace extends CrudRepository<Todo, Long> {
    @Query(value = "select * from todo where done = false",nativeQuery = true)

    public List<Todo> falseList();

    @Query(value = "select * from todo where done = true",nativeQuery = true)

    public  List<Todo> trueList();

    @Query(value = "select * from todo order by id", nativeQuery = true)
    public List<Todo> orderedAllList();


}
