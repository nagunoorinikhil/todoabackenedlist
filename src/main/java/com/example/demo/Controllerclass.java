package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@CrossOrigin(origins = "http://localhost:3001/")
public class Controllerclass {
	 List<TodoListAll>  a=new ArrayList<>();
	 
	 public Controllerclass() {
          TodoListAll obj1=new TodoListAll(1, "Task1", false);
          TodoListAll obj2=new TodoListAll(2, "Task2", false);
          TodoListAll obj3=new TodoListAll(3, "Task3", false);
          a.add(obj1);
          a.add(obj2);
          a.add(obj3);
	 }
	

//    @GetMapping(value = "/controller")
////	 @RequestMapping(value="/controller", method=RequestMethod.GET)
//	   public String todoList() {
//	      return "redirect:index.html";
//	   }
    
//    @GetMapping(value="/getjsp")
//	   public String food() {
//		return "view-todos";
//	}
	
	
	
	 @GetMapping(value = "/get")
	 @ResponseBody
	   public ResponseEntity<List<TodoListAll>> todo() {
	      return ResponseEntity.ok(a); 
	   }
	 
	 
	 @PostMapping(value = "/post")
	 @ResponseBody
	   public ResponseEntity<List<TodoListAll>> post(@RequestBody TodoListAll todoList) {
		 System.out.println(todoList);
//		 TodoListAll newadd =new TodoListAll(a.size()+1, "added", false);
		 a.add(todoList);
	      return ResponseEntity.ok(a); 
	   }
	 
	 
	 @DeleteMapping(value = "/del/{id}")
	 @ResponseBody
	   public ResponseEntity<List<TodoListAll>> delete(@PathVariable("id") int id) {
		System.out.println(a);
        Iterator<TodoListAll> iterator = a.iterator();
        while (iterator.hasNext()) {
        	TodoListAll todo = iterator.next();
            if (todo.id==id) {  // Remove odd numbers
                iterator.remove();
            }
        }
        
		System.out.println(a);
	      return ResponseEntity.ok(a); 
	   }
   

}