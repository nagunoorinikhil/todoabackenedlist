package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

@RestController
@CrossOrigin(origins = "https://todofrontenedlist.onrender.com/")
//	http://localhost:3001/
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todos")
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }
    
    
    @PostMapping("/todospost")
	   public ResponseEntity<Todo> postTodos(@RequestBody Todo todoList) {
		 System.out.println(todoList);
		 todoService.insertTodo(todoList);
		 
	      return ResponseEntity.ok(todoList); 
	   }
    
    
    @DeleteMapping("/todosdel/{id}")
	   public ResponseEntity<String> delete(@PathVariable("id") int id) {

        todoService.deleteTodoById(id);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Todo with ID " + id + " deleted successfully");
	   }
    
    
}
