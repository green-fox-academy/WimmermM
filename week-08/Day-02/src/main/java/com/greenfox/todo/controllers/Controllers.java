package com.greenfox.todo.controllers;

import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repository.TodoFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.Query;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;

@Controller
@RequestMapping(value = "/todo")
public class Controllers implements CommandLineRunner {


    @Autowired
    TodoFace myFace;
    Todo myTodo;


    @RequestMapping(value = {"/", "/list"})
    public String list(@RequestParam(value = "done", required = false) Boolean done, Model model) {
        if (done != null && !done) {

            //Displays only not done Todos
            model.addAttribute("todo", myFace.falseList());

        } else if (done != null && done) {

            //Displays only done Todos
            model.addAttribute("todo", myFace.trueList());
        } else {

            //Displays all Todos ordered by IDs
            model.addAttribute("todo", myFace.orderedAllList());

        }

        return "todolist";
    }

    //Get annotation after URL displays form to add new Todos
    @GetMapping(value = "/add")
    public String addTodo() {


        return "add";
    }

    //After submit form, creates new Todos and adds it to DB and redirect back to list page
    @PostMapping(value = "/add")
    public String addTodoPost(@RequestParam(value = "urgent") Boolean urgent,
                              @RequestParam(value = "title") String title,
                              @RequestParam(value = "dueDate")
                                  @DateTimeFormat(pattern = "yyyy-MM-dd") Date dueDate) {

        myFace.save(new Todo(title, dueDate, urgent));

        return "redirect:/todo/list";
    }

    @GetMapping(value = "/{id}/delete")
    public String delete(@PathVariable long id) {
        myFace.deleteById(id);


        return "redirect:/todo/list";
    }

    //Displays update page
    @GetMapping(value = "/{id}/update")
    public String update(@PathVariable long id, Model model) {
        model.addAttribute("todo", myFace.findById(id).get());

        return "update";
    }
    //After submit form, creates new Todos and adds it to DB and redirect to list or other page
    @PostMapping(value = "/{id}/update")
    public String updatePost(@PathVariable long id, Todo myTodo) {
        Todo x = myFace.findById(id).get();
        if (x.getDueDate().getTime() < myTodo.getDueDate().getTime() && x.isUrgent()) {

            return "justDoIt";

        } else {

            x.setTitle(myTodo.getTitle());
            x.setDueDate(myTodo.getDueDate());
            x.setDone(myTodo.isDone());
            myFace.save(x);
            return "redirect:/todo/list";
        }

    }


    @Override
    public void run(String... args) {
//        myFace.save(new Todo("Wash dishes"));
//        myFace.save(new Todo("Play World of Warcraft"));
//        myFace.save(new Todo("Dont play diablo immortal"));
//        myFace.save(new Todo("Baba Jaga"));
    }
}
