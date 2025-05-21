package br.com.gvrer.contato.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
public class Contato {
	@Id
	private long contatoid; 
	private String contato;
	private long pessoa_pessoaid;
	private long tipodecontato_tipocontatoid;
	public long getContatoid() {
		return contatoid;
	}
	public void setContatoid(long contatoid) {
		this.contatoid = contatoid;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public long getPessoa_pessoaid() {
		return pessoa_pessoaid;
	}
	public void setPessoa_pessoaid(long pessoa_pessoaid) {
		this.pessoa_pessoaid = pessoa_pessoaid;
	}
	public long getTipodecontato_tipocontatoid() {
		return tipodecontato_tipocontatoid;
	}
	public void setTipodecontato_tipocontatoid(long tipodecontato_tipocontatoid) {
		this.tipodecontato_tipocontatoid = tipodecontato_tipocontatoid;
	}
	
}
