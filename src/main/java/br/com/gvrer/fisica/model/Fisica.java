package br.com.gvrer.fisica.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
public class Fisica {
	@Id
	long fisicaid;
	String nome; 
	String sobrenome;
	String cpf;
	String rg;
	String titulodeeleitor;
	long pessoa_pessoaid;
	long genero_generoid; 
	long statusfisica_statusfisicaid;
	public long getFisicaid() {
		return fisicaid;
	}
	public void setFisicaid(long fisicaid) {
		this.fisicaid = fisicaid;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTitulodeeleitor() {
		return titulodeeleitor;
	}
	public void setTitulodeeleitor(String titulodeeleitor) {
		this.titulodeeleitor = titulodeeleitor;
	}
	public long getPessoa_pessoaid() {
		return pessoa_pessoaid;
	}
	public void setPessoa_pessoaid(long pessoa_pessoaid) {
		this.pessoa_pessoaid = pessoa_pessoaid;
	}
	public long getGenero_generoid() {
		return genero_generoid;
	}
	public void setGenero_generoid(long genero_generoid) {
		this.genero_generoid = genero_generoid;
	}
	public long getStatusfisica_statusfisicaid() {
		return statusfisica_statusfisicaid;
	}
	public void setStatusfisica_statusfisicaid(long statusfisica_statusfisicaid) {
		this.statusfisica_statusfisicaid = statusfisica_statusfisicaid;
	}
}
