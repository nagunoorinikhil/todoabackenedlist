package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todo")
public class Todo {
   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
    
   private String value;
   
   private boolean completed;

   
   public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getValue() {
	return value;
}

public void setValue(String value) {
	this.value = value;
}

public boolean isCompleted() {
	return completed;
}

public void setCompleted(boolean completed) {
	this.completed = completed;
}

    
   // getters and setters...
}