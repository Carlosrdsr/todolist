package br.com.carlosrdsr.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlosrdsr.todolist.entities.Todo;
import br.com.carlosrdsr.todolist.services.TodoService;

@RestController
@RequestMapping(value = "/todos")
public class TodoController {
	
	@Autowired
	private TodoService todoService; 
	
	@PostMapping
	public List<Todo> create(@RequestBody Todo todo){
		return todoService.create(todo);
	}
	
	@GetMapping
	public List<Todo> list(){
		return todoService.list();
	}
	
	@PutMapping
	public List<Todo> update(@RequestBody Todo todo){
		return todoService.update(todo);
	}	
	
	@DeleteMapping(value = "/{id}")
	public List<Todo> delete(@PathVariable Long id){
		return todoService.delete(id);
	}

}
