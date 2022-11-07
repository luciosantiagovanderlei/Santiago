package com.santiago.santiago.entities;

import java.io.Serializable;
import java.util.Objects;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long codCliente;
	private String nome;
	private String endereco;
	private String rg;
	private String cpf;
	private String telefone;
	
	public Cliente() {
		
	}

	public Cliente(Long codCliente, String nome, String endereco, String rg, String cpf, String telefone) {
		super();
		this.codCliente = codCliente;
		this.nome = nome;
		this.endereco = endereco;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public Long getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(Long codCliente) {
		this.codCliente = codCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codCliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(codCliente, other.codCliente);
	}

	
}
