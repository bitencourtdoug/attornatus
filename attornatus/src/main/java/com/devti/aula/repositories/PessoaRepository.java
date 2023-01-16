package com.devti.aula.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.devti.aula.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
	
	 public List<Pessoa> findByNome(String nome); 
	 
	 public List<Pessoa> findByEndereco(String logradouro);
	

}
