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

import com.devti.aula.model.Endereco;
import com.devti.aula.services.EnderecoService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/endereco")
public class EnderecoResource {
	
	@Autowired
	EnderecoService service;
	
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "Exclui um endereço da base de dados")
	public void excluir(@PathVariable("id") int id) {
		service.excluir(id);
	}
	
	@PutMapping
	@ApiOperation(value = "Alterar um endereço na base dados")
	public Endereco altera(@RequestBody Endereco c) {		
		return service.alterar(c);
		
	}
	
	@PostMapping
	@ApiOperation(value = "Inserir um endereço no banco de dados")
	public Endereco inserirCidade(@RequestBody Endereco c) {
		return service.incluir(c);
		
	}
	
	@GetMapping
	@ApiOperation(value = "Listar todas os endereço da base de dados")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Lista de endereço")
	})
	public List<Endereco> listarTodas(){
		return service.listarTodas();
	}
	


}
