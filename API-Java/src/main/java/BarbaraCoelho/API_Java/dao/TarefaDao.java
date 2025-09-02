package BarbaraCoelho.API_Java.dao;

import java.util.List;

import BarbaraCoelho.API_Java.entity.Tarefa;

public interface TarefaDao {
	void save(Tarefa tarefa);
	void update(Tarefa tarefa);
	void delete(Long id);
	Tarefa findById(Long id);
	List<Tarefa> findAll();
}