package br.com.gvrer.endereco.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("pais")
public class Pais {
	@Id
    private long paisid;
    private String nomepais;
    private String siglapais;
    
	public long getPaisid() {
		return paisid;
	}
	public void setPaisid(long paisid) {
		this.paisid = paisid;
	}
	public String getNomepais() {
		return nomepais;
	}
	public void setNomepais(String nomepais) {
		this.nomepais = nomepais;
	}
	public String getSiglapais() {
		return siglapais;
	}
	public void setSiglapais(String siglapais) {
		this.siglapais = siglapais;
	}
}
