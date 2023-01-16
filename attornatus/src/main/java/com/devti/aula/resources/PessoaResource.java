package com.devti.aula.resources;

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


import com.devti.aula.model.Pessoa;
import com.devti.aula.services.PessoaService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/pessoa")
public class PessoaResource {
	
	@Autowired
	PessoaService service;
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "Exclui uma pessoa da base de dados")
	public void excluir(@PathVariable("id") int id) {
		service.excluir(id);
	}
	
	@PutMapping
	@ApiOperation(value = "Altera uma pessoa da base de dados")
	public Pessoa altera(@RequestBody Pessoa e ){	
		return service.alterar(e);
		
	}
	
	@PostMapping
	@ApiOperation(value = "Inserir uma pessoa na base dados")
	public Pessoa inserirPessoa(@RequestBody Pessoa e) {
		return service.incluir(e);
		
	}
	
	
	@GetMapping
	@ApiOperation(value = "Lista todos as pessoas da base de dados")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Lista de Pessoas")
	})
	public List<Pessoa> listarTodos(){
		return service.listarTodos();
		
	}
	
	@GetMapping("/buscarendereco/{pessoa}")
	@ApiOperation(value = "Busca um endereço de uma pessoa")
	public List<Pessoa> buscarEndereco(@PathVariable("endereco") String logradouro){
		return service.buscarEndereco(logradouro);
	}
	
	@GetMapping("/buscanome/{pessoa}")
	@ApiOperation(value = "Busca uma pessoa pelo nome")
	public List<Pessoa> buscarPessoa(@PathVariable("pessoa") String nome){
		return service.buscarPessoa(nome);
	}	
	 

}
