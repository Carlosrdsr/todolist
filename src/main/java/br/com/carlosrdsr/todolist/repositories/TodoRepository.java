package br.com.carlosrdsr.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.carlosrdsr.todolist.entities.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
