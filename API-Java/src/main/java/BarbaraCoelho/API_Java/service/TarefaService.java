package BarbaraCoelho.API_Java.service;

import java.util.List;

import BarbaraCoelho.API_Java.entity.Tarefa;

public interface TarefaService {
	void salvar(Tarefa tarefa);
	void editar(Tarefa tarefa);
	void excluir(Long id);
	Tarefa buscarPorId(Long id);
	List<Tarefa> buscaTodos();
}