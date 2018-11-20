package com.greenfox.todo.model;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
public class Todo {


    @Id
    @GeneratedValue
    long id;
    String title;
    boolean urgent;
    boolean done;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.TIMESTAMP)
    Date dueDate;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    Date creationDate;


    public Todo() {

    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

//    public String dateToString(){
//        String dayString = getDueDate().toString();
//        String timeString = dayString.substring(0,10);
//
//        return timeString;
//    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Todo(String title, Date dueDate, boolean urgent) {
        this.title = title;
        this.urgent = urgent;
        this.done = false;
        this.dueDate = dueDate;
        this.creationDate = creationDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
