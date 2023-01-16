package com.devti.aula.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;


@Entity
public class Endereco implements Serializable{	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(value = "Chave primaria do endereço")
	private Integer id;		
	
	@Column
	@ApiModelProperty(value = "Nome da rua")
	private String logradouro;
	
	@Column
	@ApiModelProperty(value = "Cep - Do endereço")
	private Integer cep;
	
	@Column
	@ApiModelProperty(value = "Numero correspondente ao endereço")
	private Integer numero;
	
	
	@Column
	@ApiModelProperty(value = "Nome da Cidade")
	private String nome;
	
	@Column
	@ApiModelProperty(value = "Unidade federativa (estado) da cidade")
	private String uf;
	
	
	
	public Endereco() {
		this(0,"",0,0,"","");
	}
	
	

	public Endereco(Integer id, String logradouro, Integer cep, Integer numero, String nome, String uf) {
		super();
		this.id = id;
		this.logradouro = logradouro;
		this.cep = cep;
		this.numero = numero;
		this.nome = nome;
		this.uf = uf;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(id, other.id);
	}

	
	
	

}
