package br.com.gvrer.pessoa.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("juridica")
public class Juridica {
	@Id
	private long juridicaid;
	private String representante;
	private String funcao;
	private String razaosocial;
	private String nomefantasia;
	private String cnpj;
	private long pessoa_pessoaid;
	
	
	public long getJuridicaid() {
		return juridicaid;
	}
	public void setJuridicaid(long juridicaid) {
		this.juridicaid = juridicaid;
	}
	public String getRepresentante() {
		return representante;
	}
	public void setRepresentante(String representante) {
		this.representante = representante;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getRazaosocial() {
		return razaosocial;
	}
	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}
	public String getNomefantasia() {
		return nomefantasia;
	}
	public void setNomefantasia(String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public long getPessoa_pessoaid() {
		return pessoa_pessoaid;
	}
	public void setPessoa_pessoaid(long pessoa_pessoaid) {
		this.pessoa_pessoaid = pessoa_pessoaid;
	}
	
}
