package com.devti.aula.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devti.aula.model.Endereco;
import com.devti.aula.repositories.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	EnderecoRepository rep;
	
	
	
	
	public void excluir(Integer id) {
		Endereco enderecoExcluir = rep.findById(id).get();
		if(enderecoExcluir != null) {
			rep.delete(enderecoExcluir);
		}
	}
	
	public Endereco incluir(Endereco c) {
		return rep.save(c);
	}
	
	public List<Endereco> listarTodas(){
		return rep.findAll();
		
	}
	
	public Endereco alterar(Endereco c) {
		return rep.save(c);
	}

}
