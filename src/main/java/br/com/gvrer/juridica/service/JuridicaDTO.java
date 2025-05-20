package br.com.gvrer.juridica.service;

import org.springframework.stereotype.Service;

@Service
public class JuridicaDTO {
	
	private long pessoaid;
	private String datanascimento;
	
	private long juridicaid;	
	private String representante;	
	private String razaosocial;
	private String nomefantasia;
	private String cnpj;
	private long tipodecontatoid;
	private String tipodecontato;
	private String contato;
	
	
	private long categoriadaempresaid ;
	private String nomecategoriadaempresa ; 
	private String descricao ; 
	private String especialidade ; 
	private long juridica_juridicaid ;
	private long juridica_pessoa_pessoaid;
	
	public long getPessoaid() {
		return pessoaid;
	}
	public void setPessoaid(long pessoaid) {
		this.pessoaid = pessoaid;
	}
	public String getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}
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
	public long getTipodecontatoid() {
		return tipodecontatoid;
	}
	public void setTipodecontatoid(long tipodecontatoid) {
		this.tipodecontatoid = tipodecontatoid;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTipodecontato() {
		return tipodecontato;
	}
	public void setTipodecontato(String tipodecontato) {
		this.tipodecontato = tipodecontato;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public long getCategoriadaempresaid() {
		return categoriadaempresaid;
	}
	public void setCategoriadaempresaid(long categoriadaempresaid) {
		this.categoriadaempresaid = categoriadaempresaid;
	}
	public String getNomecategoriadaempresa() {
		return nomecategoriadaempresa;
	}
	public void setNomecategoriadaempresa(String nomecategoriadaempresa) {
		this.nomecategoriadaempresa = nomecategoriadaempresa;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public long getJuridica_juridicaid() {
		return juridica_juridicaid;
	}
	public void setJuridica_juridicaid(long juridica_juridicaid) {
		this.juridica_juridicaid = juridica_juridicaid;
	}
	public long getJuridica_pessoa_pessoaid() {
		return juridica_pessoa_pessoaid;
	}
	public void setJuridica_pessoa_pessoaid(long juridica_pessoa_pessoaid) {
		this.juridica_pessoa_pessoaid = juridica_pessoa_pessoaid;
	}

}
