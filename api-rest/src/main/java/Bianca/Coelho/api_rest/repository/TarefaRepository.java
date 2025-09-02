package Bianca.Coelho.api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Bianca.Coelho.api_rest.model.Tarefa;

@Repository
public interface TarefaRepository  extends JpaRepository <Tarefa, Long>{

}
