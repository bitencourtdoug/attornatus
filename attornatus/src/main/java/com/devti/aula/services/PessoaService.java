package com.devti.aula.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.devti.aula.model.Pessoa;
import com.devti.aula.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	PessoaRepository rep;	
	
	
	public List<Pessoa> buscarPessoa(String nome){
		return rep.findByNome(nome);
	}
	
	public List<Pessoa> buscarEndereco(String logradouro){
		return rep.findByEndereco(logradouro);
	}

		 
	
	public void excluir(Integer id) {
		Pessoa pessoaExcluir = rep.findById(id).get();
		if(pessoaExcluir != null) {
			rep.delete(pessoaExcluir);
		}
	}
	
	public Pessoa incluir(Pessoa e) {
		return rep.save(e);
	}
	
	public List<Pessoa> listarTodos(){
		return rep.findAll();
	}
	
	public Pessoa alterar(Pessoa e) {
		return rep.save(e);
	}

}
