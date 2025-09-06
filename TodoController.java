package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Todo;
import com.example.demo.service.TodoService;


@RestController
@RequestMapping("/todo")
@CrossOrigin(origins = "*")
public class TodoController {
	@Autowired
	private TodoService service;
	
	@PostMapping
	public Todo createTodo(@RequestBody Todo todo) {
	    return service.createTodo(todo);
	}
	@GetMapping
	public List<Todo> getTodo() {
		return service.getTodo(); 
	}
	@PutMapping("/{id}")
	public Todo updateTodo(@PathVariable int id,@RequestBody Todo todo) {
		todo.setId(id);
		return service.updateTodo(todo);
	}
	@DeleteMapping("/{id}")
	public String deleteTodo(@PathVariable int id) {
		return service.deleteTodo(id);
	}
}
