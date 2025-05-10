package br.com.gvrer.juridica.model;

import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.Id;

@Table("juridica")
public class Juridica {
	@Id
	private long juridicaid;	
	private String representante;	
	private String razaosocial;
	private String nomefantasia;
	private String cnpj;
	

	public String getRepresentante() {
		return representante;
	}
	public void setRepresentante(String representante) {
		this.representante = representante;
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
	public long getJuridicaid() {
		return juridicaid;
	}
	public void setJuridicaid(long juridicaid) {
		this.juridicaid = juridicaid;
	}
	
}
