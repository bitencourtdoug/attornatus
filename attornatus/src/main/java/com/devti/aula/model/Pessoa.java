package com.devti.aula.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.swagger.annotations.ApiModelProperty;


@Entity
public class Pessoa implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(value = "Chave primaria do Pessoa")
	private Integer id;
	
	@Column
	@ApiModelProperty(value = "Nome da pesssoa")
	private String nome;
	
	@Column
	@ApiModelProperty(value = "Data de nacimento")
	private Integer dataNacimento;
	
	@ManyToOne
	@ApiModelProperty(value = "Enereço da pessoa")
	private Endereco endereco;
	
	
	
	public Pessoa() {
		this(0,"",0,null);


	}
	public Pessoa(Integer id, String nome,Integer dataNacimento, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;		;
		this.dataNacimento = dataNacimento;
		this.endereco = endereco;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade() {
		return dataNacimento;
	}
	public void setIdade(Integer dataNacimento) {
		this.dataNacimento = dataNacimento;
	}
	public Endereco getCidade() {
		return endereco;
	}
	public void setCidade(Endereco endereco) {
		this.endereco = endereco;
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
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

	
}
