package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.TodoRepo;
import com.example.demo.model.Todo;

@Service
public class TodoService {
	@Autowired
	private TodoRepo repo;
	
	public Todo createTodo(Todo todo) {
		return repo.save(todo); 
	}
	public List<Todo> getTodo(){
		return repo.findAll();
	}
	public Todo updateTodo(Todo todo) {
		Optional<Todo> existingTodo=repo.findById(todo.getId());
		if(existingTodo.isPresent()) {
			Todo updatedTodo=existingTodo.get();
			updatedTodo.setMssg(todo.getMssg());
			return repo.save(updatedTodo);
		}
		else {
			throw new RuntimeException("Todo Not Found with Id "+ todo.getId());
		}
	}
	public String deleteTodo(int id) {
		repo.deleteById(id);
		return "Todo Deleted";
	}
}
