package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }
    
    
    public void insertTodo(Todo todo) {
        // Create a new Todo entity
//        Todo todo = new Todo();
//        todo.setName(name);
//        todo.setCompleted(completed);

        // Save the entity to the database using the save() method
        todoRepository.save(todo);
    }

    public void deleteTodoById(Integer id) {
        // Call the deleteById method of TodoRepository to delete the todo by ID
        todoRepository.deleteById(id);
    }
    
    
    
    
}
